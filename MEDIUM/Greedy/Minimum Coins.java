// Ques Link :- https://course.acciojob.com/idle?question=309bfcb0-7e3b-4d83-8c09-68372782fb48
import java.util.*;

public class Main {
    public static int minCoins(int coins[], int m, int V) {
		if(V==0) return 0;
		for(int i=m-1;i>=0;i--){
			if(coins[i]<=V){
				return minCoins(coins,m,V-coins[i])+1;
			}
		}
		return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        int m = coins.length;
        int V = sc.nextInt();
        System.out.println(minCoins(coins, m, V));
    }
}
