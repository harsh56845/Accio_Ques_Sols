// qUES lINK :- 
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	  public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        long nums[]=new long[n];
			long pro = 1;
	        for(int i = 0; i < n; i++)
	        {
	            nums[i] = sc.nextInt();
				pro*=nums[i];
	        }
	        Solution obj = new Solution();
	        long ans[] = obj.ProductOfArrayExceptSelf(n,nums,pro);
	        for(int i=0; i<n ; i++){
	            System.out.print(ans[i] + " ");
	        }
	    }
}
class Solution{
  public long[] ProductOfArrayExceptSelf(int n, long[] a,long pro){
	  
	  for(int i=0;i<n;i++)
		  a[i]=pro/a[i];
	  
	  return a;
	
}
}
