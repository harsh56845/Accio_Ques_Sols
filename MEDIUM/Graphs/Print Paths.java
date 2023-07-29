// QL :- https://course.acciojob.com/idle?question=22e6cae8-a37e-4320-ae71-33322d382ed2
import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
	
	public static void printAllPath(ArrayList<Edge>[]graph , int src , int dest , String asf,boolean[] isVisited){ 
      if(src==dest){
		  asf+=String.valueOf(dest);
		  System.out.println(asf);
		  return;
	  }
		isVisited[src] = true;
		for(int i=0;i<graph[src].size();i++){
			Edge e = graph[src].get(i);
			int dst = e.nbr;
			if(!isVisited[dst])
			printAllPath(graph,dst,dest,asf+String.valueOf(src),isVisited);
		}
		isVisited[src] = false;
   }

   public static void printAllPath(ArrayList<Edge>[]graph , int src , int dest , int n){ 
      //Your code here
	   boolean[] isVisited = new boolean[n+1];
	   // for(int i=src;i<=dest;i++)
	   printAllPath(graph,src,dest,"",isVisited);
   }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
      }

      int src = Integer.parseInt(br.readLine());
      int dest = Integer.parseInt(br.readLine());

      printAllPath(graph,src,dest,vtces);
   }


}
