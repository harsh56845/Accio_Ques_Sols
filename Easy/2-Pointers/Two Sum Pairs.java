// Ques Link :- https://course.acciojob.com/idle?question=6e70f2ee-6873-4373-acb9-d179d6ce555e
import java.util.*;

public class Main {

    public static List<List<Integer>> twoSum(int[] arr, int target) {
		List<List<Integer>> mainList = new ArrayList<>();
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;

		while(i<j){
			if(arr[i]+arr[j]==target){
				List<Integer> subList = new ArrayList<Integer>();
				subList.add(arr[i]);
				subList.add(arr[j]);
				// if(!mainList.contains(subList))
				mainList.add(subList);
				i++;
				j--;
				while(i<j && arr[i]==arr[i-1]) i++;
				while(i<j && arr[j]==arr[j+1]) j--;
			}
			else if(arr[i]+arr[j]<target){
				i++;
			}else{
				j--;
			}
		}
		return mainList;
		
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            Collections.sort(list);
            String ans = "";
            for (int val : list) {
              ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }
}
