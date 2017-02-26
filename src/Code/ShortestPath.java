package Code;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
	//int mst;
	public static void runBellmanFord(Graph g, Vertex source) {
		Queue<Vertex> q = new LinkedList<Vertex>();
		

		source.d = 0;
		source.seen = true;
		source.p=null;
		q.add(source);
		Vertex u;
		Vertex v;
		
	while (!q.isEmpty()) {
			u = q.remove();
			u.seen = false;
			
			for (Edge e : u.adj) {
				v = e.otherEnd(u);
				if (v.d > u.d+ e.weight) {
					v.d = u.d + e.weight;
					v.p = u;
					if (!v.seen) {
						q.add(v);
						v.seen = true;
					}
				}
			}
		}

	}}
