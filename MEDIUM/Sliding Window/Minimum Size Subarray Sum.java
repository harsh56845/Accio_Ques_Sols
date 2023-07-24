// Ques Link :- https://course.acciojob.com/idle?question=0aa20c71-6512-4796-b593-b26c0fe95ca5
// TC -> O(N)
import java.util.*;

class Solution {
    static int findLengthOfSmallestSubarray(int[] a, int K) {
        int i = 0; // Left pointer of the sliding window
        int j = 0; // Right pointer of the sliding window
        int min = Integer.MAX_VALUE; // Initialize 'min' to a large positive value
        int sum = 0; // Variable to keep track of the sum of elements in the current subarray

        // Sliding window approach to find the smallest subarray
        while (j < a.length) {
            sum += a[j]; // Expand the window by including the element at index 'j'

            // Shrink the window until the sum becomes less than K
            while (sum >= K) {
                min = Math.min(min, j - i + 1); // Update 'min' with the length of the current subarray
                sum -= a[i]; // Contract the window by removing the element at index 'i'
                i++; // Move the left pointer to the right to explore other potential subarrays
            }

            j++; // Move the right pointer to the right to expand the window further
        }

        return (min != Integer.MAX_VALUE) ? min : 0; // Return the minimum subarray length, or 0 if no valid subarray is found
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int K = scn.nextInt(); 
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt(); 
        }
        System.out.println(Solution.findLengthOfSmallestSubarray(a, K));
    }
}
