// Ques Link :- https://course.acciojob.com/idle?question=e0420aa8-f4e9-4a99-abe5-0cf0b05b3ce1
import java.util.*;

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int matrix[][], Pair query[]) {
        int n = matrix.length;
		int m = matrix[0].length;
		int[][] pref = new int[n+1][m+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				pref[i][j] = pref[i - 1][j] + pref[i][j - 1] - pref[i - 1][j - 1] + matrix[i - 1][j - 1];
				// System.out.print(pref[i][j]+" ");
			}
			// System.out.println();
		}
		List<Integer> list = new ArrayList<>();
		for(Pair p1 : query){
			int row1 = p1.row1;
			int row2 = p1.row2;
			int col1 = p1.col1;
			int col2 = p1.col2;
			
			int sum = pref[row2 + 1][col2 + 1] - pref[row1][col2 + 1] - pref[row2 + 1][col1] + pref[row1][col1];

			list.add(sum);
		}
        return list;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p=new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i]=p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for(int x: ans)
        System.out.println(x);
        sc.close();
    }
}
