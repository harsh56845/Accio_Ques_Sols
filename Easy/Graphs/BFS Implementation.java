//  QL :- https://course.acciojob.com/idle?question=9b2d5eac-703f-487c-8921-a9a641811594
import java.util.*;
import java.io.*;
 
class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];
        
        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }
 
    void addEdge(int v, int w) {
        adjList[v].add(w);
     
    }
 
    void BFS(int x) {
		boolean[] isVisited = new boolean[vertices];
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(x);
		while(q1.isEmpty()==false){
			int temp = q1.remove();
			if(isVisited[temp]) continue;
			isVisited[temp] = true;
			System.out.print(temp+" ");
			for(int i=0;i<adjList[temp].size();i++){
				q1.add(adjList[temp].get(i));
			}
		}
    }
}
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}
