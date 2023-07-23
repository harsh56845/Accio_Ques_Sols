// Ques link :- https://course.acciojob.com/idle?question=117d315f-d2e8-4eb8-9e68-bd2322a59f84
// time complexity is O(2^(2*n)) and space complexity is O(n) 
import java.io.*;
import java.util.*;

class Solution {
    public static void generateParenthesis(int n) {
        generateParenthesisHelper(n, 0, 0, "");
    }

    private static void generateParenthesisHelper(int n, int openCount, int closeCount, String s) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }

        if (openCount < n) {
            generateParenthesisHelper(n, openCount + 1, closeCount, s + "(");
        }

        if (closeCount < openCount) {
            generateParenthesisHelper(n, openCount, closeCount + 1, s + ")");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Solution.generateParenthesis(n);
    }
}

