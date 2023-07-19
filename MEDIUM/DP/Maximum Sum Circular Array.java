// Ques Link :- https://course.acciojob.com/idle?question=3f2d7318-c6e6-4511-be62-2f5a0f8daf8e
import java.util.*;

class Solution {
    public int MaxSum(int[] arr, int n) {
		int max_Subsum = -9999;
		int curr_max_Subsum = 0;
		int sum = 0;
		int min_Subsum = 9999;
		int curr_min_Subsum = 0;
		for(int i:arr){
			sum+=i;
			
			curr_max_Subsum+=i;
			max_Subsum = Math.max(max_Subsum,curr_max_Subsum);
			curr_max_Subsum = Math.max(0,curr_max_Subsum);
			
			
			curr_min_Subsum+=i;
			min_Subsum = Math.min(min_Subsum,curr_min_Subsum);
			curr_min_Subsum = Math.min(0,curr_min_Subsum);
		}
		
		if(min_Subsum==sum) return max_Subsum;

		return Math.max(max_Subsum,(sum-min_Subsum));
		
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
	    Solution Obj = new Solution();
        int ans = Obj.MaxSum(arr, n);
        System.out.println(ans);
    }
}
