package Code;

public class Edge {
	public Vertex to;
	public Vertex fro;
	public int weight;
	
	Edge(Vertex v, Vertex u, int weight){
	 fro=v;
	 to=u;
	 this.weight = weight;
	}
	
	public Vertex otherEnd(Vertex u) {
		// if the vertex u is the head of the arc, then return the tail else return the head
		if (fro == u) {
		    return to;
		} else {
		    return fro;
		}
	    }

	
}
