// Ques Link :- https://course.acciojob.com/idle?question=f16ca543-e993-49da-8606-16b65260a58b
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

		int space = N / 2;
        int stars = 1;

        // Upper half of the pattern
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= stars; k++) {
                System.out.print("*\t");
            }

            if (i <= N / 2) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }

            System.out.println();
        }
    }
}
