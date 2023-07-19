// Ques Link :- https://course.acciojob.com/idle?question=df87917b-67af-48b0-a132-0832e02a38f8
import java.util.*;
import java.io.*;


class Solution {
  static int bestTimeToBuyAndSell(int n, int[] prices) {
	  int profit = 0;
        int sell =  prices[0];
        for(int i=1;i<prices.length;i++){
            int cost = prices[i]-sell;
            profit = Math.max(profit,cost);
            sell = Math.min(sell,prices[i]);
        }
	  return profit;
  }
}
 
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int ans = Solution.bestTimeToBuyAndSell(n,a);
        System.out.println(ans);
    }
    
}
 
 
