// Ques Link :- https://course.acciojob.com/idle?question=d006251a-caec-4bb8-acc4-4d93c1d41e27
import java.util.Scanner;

public class Main {
    
    public static boolean isBST(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = isBST(arr, n) ? 1 : 0;
        System.out.println(result);
    }
}
