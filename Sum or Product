// Ques Link :- https://course.acciojob.com/idle?question=b21c97d5-59a0-441b-9679-5c97bc5f062e
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long q = sc.nextLong();
        long ans = Solution.sumOrProduct(n,q);
        System.out.println(ans);
    }
}

class Solution {
	static long mod = 1000000007;
    static long sumOrProduct(long n, long q) {
		if(q==1){
			return (long)(n+1)*n/2;
		}else{
			long pro =1;
			while(n!=1) pro=(pro*n--)%mod;
			return pro;
		}
    }
}
