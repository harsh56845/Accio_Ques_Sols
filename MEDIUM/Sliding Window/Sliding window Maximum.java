// QL :- https://course.acciojob.com/idle?question=2da7ad22-cccc-497d-864c-a3ea784e1263
import java.util.*;

class Solution{

    static int[] SlidingWindowMaximum(int N, int K, int[] arr){
		int k = K;
		int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        int[] ans = new int[n-k+1];
        st.push(n-1);
        nge[n-1] = n;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();

            st.push(i);
        }
        int ansI = 0;
        int j = 0;
        for(int i=0;i<n-k+1;i++){
            if(j<i)j=i;
            while(nge[j]<i+k) j++; 
            // = nge[j];
        
            ans[ansI++] = arr[j];
        }
        return ans;
	}
}
	// Brute Force  TC -> O(N*K)
		// int[] ans = new int[N-K+1];
		// int p = 0;
		// int start = 0;
		// int end = K-1;
		// while(end<N){
		// 	int max = -9999;
		// 	for(int i=start;i<=end;i++){
		// 		max = Math.max(arr[i],max);
		// 	}
		// 	ans[p++]=max;
		// 	start++;
		// 	end++;
		// }
		// return ans;
  //   }


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
