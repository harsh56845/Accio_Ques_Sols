// https://course.acciojob.com/idle?question=2dfce566-68fd-48da-bb5d-4a14549d064a
import java.util.*;

class Solution {
	static int ones(int[] arr,int n){
		int c = 0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				arr[i]=1;
			}
			else{
				c++;
				arr[i]=-1;
			}
		}
		return c;
	}
	static int maxSybarraySum(int[] arr,int n){
		int msf = arr[0];
		int cs = arr[0];
		for(int i=1;i<n;i++){
			cs = Math.max(arr[i],cs+arr[i]);
			msf = Math.max(msf,cs);
		}
		msf = Math.max(0,msf);
		return msf;
	}
    static int flipBits(int[] arr,int n) {
		return ones(arr,n) + maxSybarraySum(arr,n);
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Solution.flipBits(arr,n);
        System.out.println(ans);
    }
}


