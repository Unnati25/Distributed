package Code;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import Code.Graph;
import Code.Vertex;

public class SlaveThread implements Runnable {
	int processId;
	int threadName;
	public static volatile List<Vertex> set = new ArrayList<Vertex>();
	 public static volatile int count=0;
	boolean ack=false;
	public SlaveThread( int id,int name) {
		processId=id;
		  threadName = name;
	}

	
	 public synchronized void relax(Vertex u){
		Vertex v;
		for (Edge e : u.adj) {
			v = e.otherEnd(u);
			if (v.d > u.d+ e.weight) {
				v.d = u.d + e.weight;
				v.p = u;
				v.ack=true;
				
	}
		}
	}
	@Override
	 public void run() {
		
		Vertex u;
		
		u= Graph.vertices.get(this.threadName);
		if(u.d==0 || u.d!=Integer.MAX_VALUE){
	 
		relax(u);
		}
		try {
			set.add(u);
			this.wait();
			/*for(int i=0;i<Master.n;i++){
			if(Master.slaveMonitor.get(i).processId == u.name)
				Master.slaveMonitor.get(i).wait();
			}*/
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
}
