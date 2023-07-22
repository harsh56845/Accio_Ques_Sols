// Ques Link :- https://app.acciojob.com/idle?question=e56d8fb9-9b68-4cdd-a742-a8b11eb64a03
// TC -> O(N) SC -> O(N)
import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {
        //Hash Array all occ of inetger
		int[] hashArray = new int[1000001];

		// runntng for each loop
		for(int i:arr)
			hashArray[i]++;

		int maxOcc = 0;
		int maxOccEle = 0;
		// hashArray loop
		for(int i=0;i<1000001;i++){
			if(hashArray[i]>maxOcc){
				maxOcc = hashArray[i];
				maxOccEle = i;
			}
		}

		return maxOccEle;
         
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
