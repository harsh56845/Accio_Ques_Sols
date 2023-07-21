// Ques Link :- https://course.acciojob.com/idle?question=6724980a-4f60-46df-acc1-7f0144f12959
import java.io.*;
import java.util.*;

class Solution {
	public boolean isPresent(int[] arr,int low,int high,int toFind){
		if(low>high) return false;
		int mid = (low+high)/2;
		if(arr[mid]<toFind) 
			return isPresent(arr,mid+1,high,toFind);
		else if(arr[mid]>toFind)
			return isPresent(arr,low,mid-1,toFind);
		
		return true;
	}
    public int countElements(int[] arr1, int[] arr2, int m, int n, int x) {
		int count = 0;
		for(int i:arr1){
			if(isPresent(arr2,0,n-1,x-i))
				count++;
		}
		return count;
    }
}


class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int arr1[] = new int[m];
        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        int x = input.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.countElements(arr1, arr2, m, n, x));
    }
}

