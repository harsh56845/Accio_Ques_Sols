// Ques Link :- https://course.acciojob.com/idle?question=4265d603-e34e-4d86-84e8-0ce3c938c197
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        //Write code here
		long Currsum = 0;
		long Maxsum = -99999;
		for(int i:a){
			Currsum+=i;
			Maxsum = Math.max(Maxsum,Currsum);
			Currsum = Math.max(Currsum,0);
		}
		return Maxsum;
    }
}
