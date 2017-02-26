package Code;


/* Ver 1.0: Driver code for MST and Shortest paths */

import java.util.Scanner;
import java.lang.Comparable;
import java.io.FileNotFoundException;
import java.io.File;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
	Scanner in;
	/*int VERBOSE = 0;

      if (args.length > 0) {
            File inputFile = new File(args[0]);
            in = new Scanner(inputFile);
        } else {
            in = new Scanner(System.in);
        }
        
	if (args.length > 1) { VERBOSE = Integer.parseInt(args[1]); }*/
	in = new Scanner(System.in);
	//Graph g = Graph.readWeight(in);
	
/*	System.out.println("Input the source vertex id");
        int src = in.nextInt();
        Vertex s = g.getVertex(src);*/
        
      //// ShortestPath.runBellmanFord(g,s);
       System.out.println();
      /* for(Vertex u:g) {
           System.out.println(u.name + " " + u.d + " " + u.p.name);
           }*/
       /*for(int i=0;i<g.vertices.size();i++){
    	   System.out.println(g.vertices.get(i).name+ " "+ g.vertices.get(i).d+ " "+ g.vertices.get(i).p);
       }*/
       }
      
    
}

