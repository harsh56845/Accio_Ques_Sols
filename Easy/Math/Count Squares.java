// Ques Link :- https://course.acciojob.com/idle?question=1b77400f-f053-4b15-a5c7-36eb134df7e5
import java.io.*;
import java.util.*;

// TC-> O(1) constant time , SC -> O(1) constant space
class Solution {
    public int CountSquares(int n) {
        return (int)Math.sqrt(n-1);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Solution Obj = new Solution();

        System.out.println(Obj.CountSquares(n));
    }
}
