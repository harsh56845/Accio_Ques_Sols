// Ques Link :- https://course.acciojob.com/idle?question=7b5f1f36-e6f6-40e7-a13f-1b27ba29a3bd
import java.util.*;

class Solution {

    public int solve(int nums[],int n) {
		Stack<Integer> st = new Stack<>();
        for(int i=0;i<nums.length-1;i++)
            if(st.isEmpty() || nums[st.peek()]>nums[i])
                st.push(i);

        int max = 0;
        for(int i=nums.length-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                max = Math.max(max,i-st.pop());
            }
        }
        return max;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        Solution obj=new Solution();
        System.out.println(obj.solve(nums,n));
        sc.close();
    }
}
