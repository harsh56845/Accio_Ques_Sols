// QL :- https://course.acciojob.com/idle?question=1a8e04d7-f665-46e5-ab81-59cdb1ceda32
import java.io.*;
import java.util.*;

class Solution {
    public static int longestUniqueSubsttr(String str) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = -1;
        while (j < str.length()) {
            // If the character at index 'j' is already in the set, remove characters from the beginning of the substring
            // until the character at index 'j' is no longer in the set. This way, we ensure that the substring between
            // indices 'i' and 'j' has unique characters.
            if (set.contains(str.charAt(j))) {
                while (set.contains(str.charAt(j))) {
                    set.remove(str.charAt(i));
                    i++;
                }
            }

            // Update the maximum length of unique substring encountered so far.
            max = Math.max(max, j - i + 1);

            // Add the character at index 'j' to the set as it's a part of the current substring.
            set.add(str.charAt(j));
            j++;
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}
