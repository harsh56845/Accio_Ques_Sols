// Ques link :- https://course.acciojob.com/idle?question=faddb193-7416-4426-8c42-99dcd35916a8
import java.util.*;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
		int count=0;
		int start=0;
		int end=0;
		int n = nums.length;
		int pro = 1;
		while(end<n){
			pro*=nums[end];
			
			// if pro not less than k
			while(pro>=k && start<n){
				pro/=nums[start];
				start++;
			}
			// if pro less then k
			count+= end-start+1;
			end++;
			
		}
		return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.numSubarrayProductLessThanK(arr, k);
        System.out.println(result);
        sc.close();
    }
}
