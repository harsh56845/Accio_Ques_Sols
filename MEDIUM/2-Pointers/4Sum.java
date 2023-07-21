// Ques Link :-https://course.acciojob.com/idle?question=8857040e-21ae-471d-b2ee-8b01e18f681d
import java.util.*;
import java.io.*;
class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       List<List<Integer>> mainList = new ArrayList<>();
	   Arrays.sort(nums);
	   int n = nums.length;
	   for(int i=0;i<n-3;i++){
		   // if(i!=0 && nums[i]==nums[i-1]) continue;
		   int a = nums[i];
		   for(int j=i+1;j<n-2;j++){
			   // if(j!=1 && nums[j]==nums[j-1]) continue;
			   int b = nums[j];
			   int k = j+1;
			   int L = n-1;
			   while(k<L){
				   int c = nums[k];
				   int d = nums[L];
				   int sum = a+b+c+d;
				   if(sum>target){
					   L--;
				   }
				   else if(sum<target){
					   k++;
				   }
				   else{
					   List<Integer> subList = new ArrayList<>();
					   subList.add(a);
					   subList.add(b);
					   subList.add(c);
					   subList.add(d);
					   mainList.add(subList);
					   L--;
					   k++;
					   while(k<L && nums[L]==nums[L+1]) L--;
					   while(k<L && nums[k]==nums[k-1]) k++;
				   }
				   while(j+1<n && nums[j+1]==nums[j]) j++;
				   while(i+1<j && nums[i+1]==nums[i]) i++;
			   }
		   }
	   }
	   return mainList;
   }
}

public class Main
{
	    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        List<List<Integer>> res = Obj.fourSum(nums, k);

      
        for(int i= 0; i<res.size(); i++){
           Collections.sort(res.get(i));
        }

     
        Collections.sort(res, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
               

        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}
