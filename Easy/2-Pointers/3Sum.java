// Ques Link :- https://course.acciojob.com/idle?question=4a19f884-ea9e-4fe9-b240-e43c935fb8b2
import java.io.*;
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
		List<List<Integer>> sol = new ArrayList<>();
		Arrays.sort(arr);
		for(int m=0;m<arr.length-2;m++){
			if(m!=0 && arr[m]==arr[m-1]) continue;
			int ele = arr[m];
			int i = m+1;
			int j = arr.length-1;
			while(i<j){
				int sum = ele+arr[i]+arr[j];
				if(sum==0){
					List<Integer> subSol = new ArrayList<>();
					subSol.add(ele);
					subSol.add(arr[j]);
					subSol.add(arr[i]);
					if(sol.contains(subSol)==false)
					sol.add(subSol);
					i++;
					j--;
				}
				else if(sum>0){
					j--;
				}
				else{
					i++;
				}		
			}
		}
		return sol;
    }
}


class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Solution solution = new Solution();
        List<List<Integer>> result = solution.threeSum(nums);
        // Sort all lists inside the list first
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }
        // Sort the list
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> l1, List<Integer> l2) {
                for (int i = 0; i < l1.size(); i++) {
                    if (l1.get(i) < l2.get(i)) return -1;
                    else if (l1.get(i) > l2.get(i)) return 1;
                }
                return 0;
            }
        });
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

