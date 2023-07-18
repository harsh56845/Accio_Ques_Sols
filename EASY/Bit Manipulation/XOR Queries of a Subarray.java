// Ques Link :- https://course.acciojob.com/idle?question=2b47cc50-0795-4f02-83ff-53438d39a9df
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int[] xorQueries(int[] arr, int[][] queries) {
		int n = arr.length;
		int[] ans = new int[queries.length];
		for(int i=1;i<n;i++){
			arr[i] = arr[i-1]^arr[i];
		}
		int k = 0;
		for(int[] qu:queries){
			int l = qu[0];
			int r = qu[1];
			if(l==0) ans[k++] = arr[r];
			else ans[k++] = arr[r]^arr[l-1];
		}
		return ans;
	}   
}

public class Main {
	  public static void main(String[] args) throws Throwable {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int q = sc.nextInt();
	        int [] arr= new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        int [][] queries= new int[q][2];
	        for(int i=0;i<q;i++){
	            for(int j=0;j<2;j++){
	                queries[i][j]=sc.nextInt();
	            }
	        }
	        Solution Obj= new Solution();
	        
	        int [] result = Obj.xorQueries(arr,queries);
	        for(int i=0;i<result.length;i++){
	            System.out.print(result[i]+" ");
	    }
}
}
