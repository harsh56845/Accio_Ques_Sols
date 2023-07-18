// Ques Link :- https://course.acciojob.com/idle?question=6d37d97f-e4d9-4d08-8bde-d3a971bc5cda
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nextLuckyNumber = findNextLuckyNumber(n);
        System.out.println(nextLuckyNumber);
    }
    
    public static int findNextLuckyNumber(int n) {
        while (true) {
            n++;
            if (isLuckyNumber(n)) {
                return n;
            }
        }
    }
    
    public static boolean isLuckyNumber(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }
    
    public static int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
