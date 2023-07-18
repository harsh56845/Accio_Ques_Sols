// Ques Link :- https://course.acciojob.com/idle?question=c4eb459b-ea8e-4c06-a898-5d87646be90e
import java.util.*;

class Solution {
    public int pivotIndex(int[] nums) {
		int n = nums.length;
		int[] Left_Prefix_Array = nums.clone();
		int[] right_Prefix_Array =  nums.clone();

		for(int i=1;i<n;i++) Left_Prefix_Array[i]+=Left_Prefix_Array[i-1];
		
		for(int i=n-2;i>=0;i--) right_Prefix_Array[i]+=right_Prefix_Array[i+1];

		for(int i=0;i<n;i++) 
			if(Left_Prefix_Array[i]==right_Prefix_Array[i])
				return i;

		return -1;
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
        Solution Obj = new Solution();
        int result = Obj.pivotIndex(arr);
        System.out.println(result);
        sc.close();
    }
}
