package Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master implements Runnable {
	static int n;
	
	static List<SlaveThread> slaveMonitor = new ArrayList<SlaveThread>();
	@Override
	public void run() {
		
		int round=0;
			Scanner in = new Scanner(System.in);
			System.out.println("Input the no of process");
			  n = in.nextInt();
			System.out.println("Input the id of " + n + "processes");
			int[] Id = new int[n];
			 int[][] weight = new int[n][n];
			
			for(int i=0;i<n;i++){
				Id[i]=in.nextInt();
			}
			Graph g = new Graph(n, Id);
			System.out.println("Input the weight matrix");
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					
					weight[i][j] = in.nextInt();
					if(weight[i][j]!=0){
						
						g.addEdge(i, j, weight[i][j]);
					}
				}
			}

			System.out.println("Input the source vertex id");
		        int src = in.nextInt();
		        Vertex s = g.getVertex(src);
		        s.d=0;
		        s.p=null;
		        s.seen=true;
		        for(int i=0;i<n;i++){
			         SlaveThread st = new SlaveThread(Id[i], i);
			         slaveMonitor.add(st);
			        }
		        for(int i=0;i<n;i++){
		       
		        	slaveMonitor.get(i).run();
		        }
		       while(round!=n){
		    	  if(SlaveThread.set.size()==n){
		    		  round++;
		    		  for(SlaveThread st :slaveMonitor){
		    			  st.notify();
		    		  }
		    		  SlaveThread.set.clear();
		    	  }
		        	
		        }
		    
		        for(Vertex u:g) {
		            System.out.println(u.name + " " + u.d + " " + u.p);
		            }
			
		}
	
	public static void main(String args[]){
		Master m = new Master();
		m.run();
	}
		
	}


