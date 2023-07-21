// Ques Link :- https://course.acciojob.com/idle?question=1fb1edd7-9b93-4d5e-9108-3484e8afe20b
import java.io.*;
import java.util.*;

class Accio{
    public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				ans[1] = i;
				ans[0] = map.get(target-nums[i]);
				return ans;
			}
			map.put(nums[i],i);
		}
		return ans;
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        Accio obj = new Accio();
        int[] arr = obj.twoSum(nums,target);
        System.out.print(arr[0]);
        System.out.print(' ');
        System.out.print(arr[1]);
    }
}
