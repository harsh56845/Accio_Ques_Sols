// Ques link :- https://course.acciojob.com/idle?question=004d7d5b-4b64-439a-9e91-7005b3017452
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.printRightArrowPattern(n);
    }
}

class Solution {
    static void printRightArrowPattern(int n) {
        int lineStar = n / 2 + 1;
        for (int i = 1; i <= n; i++) {
            // For spaces
            for (int j = 1; j <= n / 2; j++) {
                if (i == lineStar) {
                    System.out.print("*" + "\t");
                } else {
                    System.out.print("\t");
                }
            }

            // Upper triangle
            for (int j = 1; j <= i; j++) {
                if (i <= n / 2 + 1) {
                    System.out.print("*" + "\t");
                }
            }

            // Lower triangle
            for (int k = lineStar - 1; k >= i - lineStar; k--) {
                if (i > n / 2 + 1) {
                    System.out.print("*" + "\t");
                }
            }

            System.out.println();
        }
    }
}
