// Ques Link :- https://course.acciojob.com/idle?question=91bfdb90-9f0c-4b9c-b4d5-f40a17b68dbc
import java.util.*;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int result = Integer.MIN_VALUE;
        
        for(int left =0 ;left<matrix[0].length; left++){
            
            int[] rSum = new int[matrix.length];
            
            for(int right = left;right<matrix[0].length;right++){
                for(int row=0; row < matrix.length; row++)
                    rSum[row] += matrix[row][right];
					
					//explanation of these 3 loops starts from 02:00 in Video
                
                TreeSet<Integer> set = new TreeSet<>();
                
                set.add(0);
                int cs = 0;
                
                for(int a: rSum){
                    cs += a;
					
                    //if you don't understand what exactly is going on here
					// then watch the video from 12:27
					
                    Integer target = set.ceiling(cs-k);
                    
                    if(target !=null)
                        result = Math.max(result,cs-target);
                    set.add(cs);
                }
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.maxSumSubmatrix(matrix, k));
        sc.close();
    }
}
