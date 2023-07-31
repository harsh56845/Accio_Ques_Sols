// QL :- https://course.acciojob.com/idle?question=281f855c-1a46-4dfb-9239-79478b2c24ea
// Java program to sum two numbers
// represented two arrays.
import java.util.*;
// TC - > O(n+m) Sc -> O(n+m)
public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
	  int bigLen = n > m ? n : m;
	  int[] ans = new int[bigLen];
	  // a array last index
	  int i = n-1;
	  // b array last index
	  int j = m-1;
	  // ans array last index
	  int k = bigLen-1;
	  // carry
	  int carry = 0;
	  while(i>=0 || j>=0){
		  int sum = carry;
		  if(i>=0) sum+=a[i];
		  if(j>=0) sum+=b[j];
		  // if we add two dig num => 1 digit number 
		  // if we get 2 digit that means 2nd place digt is our carry
		  // exmapl 9+4=13 -> 1 is our array , 3 is our sum
		  ans[k] = sum%10;
		  carry = sum/10;
		  i--;
		  j--;
		  k--;
	  }
	  // if we still have a carry
	  if(carry!=0){
		  // then we will make ans extra sapce for that
		  int[] ans1 = new int[bigLen+1];
		  ans1[0] = carry;
		  for(int z=1;z<bigLen+1;z++)
			  ans1[z] = ans[z-1];
		  return ans1;
	  }
	  return ans;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}
