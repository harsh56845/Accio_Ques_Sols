// Ques Link :- https://course.acciojob.com/idle?question=b159eb89-5c05-4e0a-a749-49c234e5ed98
// Tc -> O(N) Sc-> O(N)
import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
		// 1st approch HASHMAP // Optimised approch TC O(N) , SC O(1)
		int max_op = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:nums){
			int compliment = k-i;
			int occurrence =  map.getOrDefault(compliment,0);

			if(occurrence>0){
				max_op++;
				map.put(compliment,occurrence-1);
			}
			else{
				map.put(i,map.getOrDefault(i,0)+1);
			}
		}
		return max_op;

		// 2nd approch 2-Pointers // Brute force approch TC O(NlogN) , SC O(1)
		// int i = 0;
		// int j = nums.length-1;
		// int max = 0;
		// Arrays.sort(nums);
		// while(i<j){
		// 	int sum = nums[i]+nums[j];
		// 	if(sum==k){
		// 		max++;
		// 		i++;
		// 		j--;
		// 	}
		// 	else if(sum<k){
		// 		i++;
		// 	}
		// 	else{
		// 		j--;
		// 	}
		// }
		// return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k;
        k = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.maxOperations(arr, k);
        System.out.println(result);
        sc.close();
    }
}
