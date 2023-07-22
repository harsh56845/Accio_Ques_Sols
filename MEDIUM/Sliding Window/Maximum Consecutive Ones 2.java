// ques link :- https://course.acciojob.com/idle?question=e40d0a42-b09e-4fc8-9be8-2d5fb508fdad
// time complexity of the code is O(n),   space complexity of the code is O(1)
import java.util.*;

class Solution {
    static int maxOne(int arr[], int n,int k)
    {
        int i=0;
		int j=0;
		int count_zero =0;
		int max_one = 0;
		while(j<n){
			if(arr[j]==0){
				count_zero++;
			}
			while(count_zero>k){
				if(arr[i]==0)
					count_zero--;
				i++;
			}
			max_one = Math.max(max_one,j-i+1);
			j++;
		}
		return max_one;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.maxOne(array,n,k));
    }
}
