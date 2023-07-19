// Ques Link :- https://course.acciojob.com/idle?question=71f9e64f-56ec-499b-95d0-da312adf139c
import java.util.*;

class Solution {
    public boolean RangeCheck(int[][] intervals, int a, int b) {
        // Sort the intervals based on the start position
        Arrays.sort(intervals, (a1, a2) -> a1[0] - a2[0]);
        
        int n = intervals.length;
        int index = 0;
        int maxEnd = a - 1; // Initialize the maxEnd as a-1 to check if the range starts from a
        
        // Iterate through the intervals and try to cover the range [a, b]
        while (index < n) {
            int start = intervals[index][0];
            int end = intervals[index][1];
            
            if (maxEnd >= b) {
                // If maxEnd already covers the range [a, b], we're done
                break;
            }
            
            if (start > maxEnd + 1) {
                // There's a gap between maxEnd and the current interval
                return false;
            }
            
            // Update the maxEnd to the current interval's end
            maxEnd = Math.max(maxEnd, end);
            index++;
        }
        
        return maxEnd >= b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        Solution obj = new Solution();
        if (obj.RangeCheck(intervals, a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
