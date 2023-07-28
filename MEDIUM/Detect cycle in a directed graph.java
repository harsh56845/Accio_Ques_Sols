// QL :- https://course.acciojob.com/idle?question=f418b898-6922-4c8a-91f3-9cf060a62957
import java.util.*;
import java.lang.*;
import java.io.*;
// TC -> O(V+E) , SC -> O(V)
class Solution {
	public boolean DFS(int V,ArrayList<Integer>[] adj,boolean[] isVisited,boolean[] rec_stack){
		isVisited[V] = true;
		rec_stack[V] = true;
		for(int i=0;i<adj[V].size();i++){
			int currV = adj[V].get(i);
			if(rec_stack[currV]) return true;
			else if(!isVisited[currV])
				if(DFS(currV,adj,isVisited,rec_stack)){
					return true;
				}
		}
		rec_stack[V] = false;
		return false;
	}
	public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
		boolean[] isVisited = new boolean[V];
		boolean[] rec_stack = new boolean[V];
		// ArrayList<Integer>[] graph = new ArrayList[V];
		// for(ArrayList<Integer> arr : adj){
		// 	System.out.println(arr);
		// }
		// return true;
		return DFS(0,adj,isVisited,rec_stack);
   }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        Solution obj = new Solution();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
