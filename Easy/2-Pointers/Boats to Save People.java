// Ques Link :- https://course.acciojob.com/idle?question=2043dd77-9c0e-40e0-ba3e-71241af644cc
import java.io.*;
import java.util.*;
class Solution
{
      public static int numRescueBoats(int[] people, int limit) {
		  Arrays.sort(people);
		  int no_of_boats = 0;
		  int i = 0;
		  int j = people.length-1;
		  while(i<=j){
			  int sum = people[i] + people[j];
			  if(sum<=limit){
				  no_of_boats++;
				  i++;j--;
			  }
			  else{
				  no_of_boats++;
				  j--;
			  }
		  }
		  return no_of_boats;
      }
}
public class Main {
	

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(Solution.numRescueBoats(nums, k));
	}

}
