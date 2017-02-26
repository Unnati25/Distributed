package Code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Graph implements Iterable<Vertex>{
	public static List<Vertex> vertices;
	int numnodes;

	int[] Id;
	 Graph(int size, int[] ID) {
		  this.Id = ID;
			this.numnodes = size;
			this.vertices = new ArrayList<>(numnodes);
			//vertices.add(null);
			// create an array of Vertex objects
			for (int i = 0; i < numnodes; i++)
				this.vertices.add(new Vertex(Id[i]));
		    }
	 
	  void addEdge(int a, int b, int weight) {
			Vertex u = vertices.get(a);
			Vertex v = vertices.get(b);
			Edge e = new Edge(u, v, weight);
			u.adj.add(e);
			v.adj.add(e);
			}
	  Vertex getVertex(int n) {
			return this.vertices.get(n);
		    }
	/*
	public static Graph readWeight( Scanner in){
		
		System.out.println("Input the no of process");
		int n = in.nextInt();
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
		return g;
		
		
		
	}*/

	@Override
	public Iterator<Vertex> iterator() {
		Iterator<Vertex> it = this.vertices.iterator();
		//it.next();  // Index 0 is not used.  Skip it.
		return it;
	}

}
