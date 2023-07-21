// Ques Link :- https://course.acciojob.com/idle?question=79709734-b342-47e3-a9ea-6ae63b0692d7
import java.io.*;
import java.util.*;

class Solution {
    public static int maxConsecutiveOnes(int[] arr, int n) {
        int max = 0; // Initialize the maximum consecutive count of 1s
        int count = 0; // Initialize the current consecutive count of 1s

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count); // Update the maximum count if needed
            } else {
                count = 0; // Reset the count if the current element is not 1
            }
        }
        
        return max;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
