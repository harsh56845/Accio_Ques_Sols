// Ques Link :- https://course.acciojob.com/idle?question=f2ca55fd-3a7f-4a15-8e96-fd47960a21c9
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int nums[]=new int[n];
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
	        }
	        Solution obj = new Solution();
	        int ans[] = obj.ProductOfArrayExceptSelf(n,nums);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
	// inplace algo
  public int[] ProductOfArrayExceptSelf(int n, int[] nums){
        int[] output = new int[n];
        
        if(n<1) return output;
        
        int product = 1;
        for(int i=0;i<n;i++) {
            product*=nums[i];
            output[i] = product;
        }
        product = 1;
        for(int i=n-1;i>0;i--) {
            output[i] = output[i-1] * product;
            product*=nums[i];
        }
        output[0] = product;
        return output;
}
}
