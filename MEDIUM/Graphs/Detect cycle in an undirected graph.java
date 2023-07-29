// Ques Link :- https://course.acciojob.com/idle?question=c5f395d4-c8ed-4c3c-88e9-285a189bddca
import java.io.*;
import java.util.*;

class Solution {
	public static boolean DFS(int V, ArrayList<ArrayList<Integer>> adj,boolean[] isVisited,int parent){
		isVisited[V] = true;
		for(int i=0;i<adj.get(V).size();i++){
			int currV = adj.get(V).get(i);
			// 1st cond
			if(isVisited[currV] && currV!=parent){
				return true;
			}
			// 2nd cond == the do nothing // if(isVisited[currV] && currV==parent){}
			// 3rd cond
			if(!isVisited[currV]){
				if(DFS(currV,adj,isVisited,V)) return true;
			}
		} 
		return false;
	}
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       // Your code here
		boolean[] isVisited = new boolean[V];
		for (int i = 0; i < V; i++) {
            if (!isVisited[i]) {
                if (DFS(i, adj, isVisited,-1)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = Solution.isCycle(N,adj);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
