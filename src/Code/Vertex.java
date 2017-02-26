package Code;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	List<Edge> adj; // list of edges per vertex
	int d; // distance of the vertex from source
	Vertex p; //parent of the vertex
	int name;//unique Id of the vertex
	boolean seen; 
	boolean ack;
	Vertex(int n){
		name = n;
		ack=false;
		seen=false;
		d=Integer.MAX_VALUE;
		p=null;
		 adj = new ArrayList<Edge>();
	}
	 public String toString() {
	    	return Integer.toString(name);
	    }
}
