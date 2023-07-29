// QL :- https://course.acciojob.com/idle?question=bc51d934-d08b-4b7d-a852-2dec91e07bce
import java.util.*;

class Solution {
	public static void DFS(List<List<Integer>> graph, int node,boolean isVisited[]){
		System.out.print(node+" ");
		isVisited[node] = true;
		for(int i=0;i<graph.get(node).size();i++){
			int currNode = graph.get(node).get(i); 
			if(!isVisited[currNode])
				DFS(graph,currNode,isVisited);
		}
	} 
    public static void DFSTraversal(List<List<Integer>> edges, int n) {
        List<List<Integer>> graph = new ArrayList<>();
		for(int i = 0;i<n;i++){
			graph.add(new ArrayList<Integer>());
		}
		for(List<Integer> e : edges){
			int u = e.get(0);
			int v = e.get(1);
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for(int i =0;i<n;i++) 
			Collections.sort(graph.get(i));

		boolean isVisited[] = new boolean[n];
		DFS(graph,0,isVisited);
		// System.out.println(graph);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        Solution ob = new Solution();
        ob.DFSTraversal(ed, n);
    }
}
