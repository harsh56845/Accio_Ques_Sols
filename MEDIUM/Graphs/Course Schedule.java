// QL :-  https://course.acciojob.com/idle?question=98332447-d28d-42ee-9843-3d4d9d5ea20d
import java.util.*;

class Solution {
    public boolean DFS(ArrayList<ArrayList<Integer>> adj, int v, boolean[] isVisited, boolean[] isStack) {
        if (isStack[v]) {
            return true; // Cycle detected
        }

        if (isVisited[v]) {
            return false; // Already visited, no cycle
        }

        isVisited[v] = true;
        isStack[v] = true;

        for (int i = 0; i < adj.get(v).size(); i++) {
            int curr_v = adj.get(v).get(i);
            if (DFS(adj, curr_v, isVisited, isStack)) {
                return true; // Cycle detected
            }
        }

        isStack[v] = false;
        return false; // No cycle detected
    }

    public int canFinish(int n, int[][] prerequisites) {
        boolean[] isVisited = new boolean[n];
        boolean[] isStack = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int[] pre : prerequisites) {
            adj.get(pre[0]).add(pre[1]);
        }

        for (int i = 0; i < n; i++) {
            if (DFS(adj, i, isVisited, isStack)) {
                return 0; // Cycle detected, cannot finish all courses
            }
        }

        return 1; // All courses can be finished
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int prerequisites[][] = new int[M][2];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++)
                prerequisites[i][j] = sc.nextInt();
        }

        Solution obj = new Solution();
        System.out.println(obj.canFinish(N, prerequisites));
    }
}
