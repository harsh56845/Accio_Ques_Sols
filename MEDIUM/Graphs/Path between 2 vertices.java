// QL :- https://course.acciojob.com/idle?question=2b6f51da-cb55-412f-a0b5-47724e221ca3
import java.io.*;
import java.util.*;

class Solution {

	boolean DFS(ArrayList<ArrayList<Integer>> Edges,int U,int V,boolean[] isVisited){
		if(U==V){
			return true;
		}
		isVisited[U] = true;
		for(int i=0;i<Edges.get(U).size();i++){
			int curr_U = Edges.get(U).get(i);
			if(!isVisited[curr_U] && DFS(Edges,curr_U,V,isVisited)) return true;
		}
		isVisited[U] = false;
		return false;
	}
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
		boolean[] isVisited = new boolean[N+1];
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<=N;i++) adj.add(new ArrayList<Integer>());
		for(ArrayList<Integer> e:Edges){
			adj.get(e.get(0)).add(e.get(1));
			adj.get(e.get(1)).add(e.get(0));
		}
		return DFS(adj,U,V,isVisited);
    }
}

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

