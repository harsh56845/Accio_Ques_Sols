// Ques Link :- https://course.acciojob.com/idle?question=394beaf0-a22e-4e5d-81ca-9b29ea03f57e
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public boolean carPooling(int[][] trips, int capacity) {
		int[] arr = new int[10001];
		for(int[] tp:trips){
			int pass = tp[0];
			int start = tp[1];
			int end = tp[2];
			arr[start]+=pass;
			arr[end]-=pass;
		}

		for(int i: arr){
			capacity-=i;
			if(capacity<0) return false;
		}

		return true;
	}
}
public class Main {
	   public static void main(String args[]) {
		  
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[][] trips = new int[n][3];
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < 3; j++) {
		                trips[i][j] = sc.nextInt();
		            }
		        }
		        int k = sc.nextInt();
	           
	        Solution obj= new Solution();
	        System.out.println(obj.carPooling(trips,k));
	    }
}
