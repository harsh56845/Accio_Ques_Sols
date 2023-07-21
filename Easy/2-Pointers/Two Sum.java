// Ques Link :- https://course.acciojob.com/idle?question=05d6b1b0-d843-4974-8a19-c65be520d5a9
import java.io.*;
import java.util.*;

class Accio{
    public static int[] twosum(int[] arr, int target) {
		int[] ans = new int[2];
				int i = 0;
				int j = arr.length-1;
				while(i<j){
	
					if(arr[i]+arr[j]==target){
						ans[0] = i+1;
						ans[1] = j+1;
						return ans;
					}
					
					if(arr[i]+arr[j]<target){ 
						i++;
					}else{
						j--;
					}
				}
			return ans;
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
		int target = input.nextInt();
        Accio obj = new Accio();
        int[] arr = obj.twosum(nums,target);
        System.out.print(arr[0]);
        System.out.print(' ');
        System.out.print(arr[1]);
    }
}
