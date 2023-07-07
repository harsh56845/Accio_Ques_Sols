// Ques link :- https://course.acciojob.com/idle?question=0ce0a60b-c786-4e54-90d4-40dd4c7896ac
import java.util.*;

class Solution 
{
    static String factDigitSum(int n) {
		int[] factList = new int[10];
		factList[0] = 1;
		for(int i=1;i<10;i++){
			factList[i] = i*factList[i-1];
		}
		String ans = "";
		// while(n!=0){
			for(int i=9;i>=1;i--){
				while(factList[i]<=n){
					n=n-factList[i];
					ans= String.valueOf(i) +ans;
					// break;
				}
			}
		// }
      return ans;
    }
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = Solution.factDigitSum(n);
        System.out.println(ans);
    }
}
