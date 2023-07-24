// QL :- https://course.acciojob.com/idle?question=570d8943-8fce-4bdd-8092-83fb3935ab63
import java.util.*;
// TC -> O(m * p * n) SC-> O(m * n)
class Accio {
    public int[][] MatMul(int m, int p, int n, int[][] A, int[][] B) {
        int[][] result = new int[m][n];
        MatMulHelper(A, B, result, 0, 0, 0, m, p, n);
        return result;
    }

    private void MatMulHelper(int[][] A, int[][] B, int[][] result, int i, int j, int k, int m, int p, int n) {
        if (i >= m || j >= n || k >= p)
            return;

        if (k < p) {
            result[i][j] += A[i][k] * B[k][j];
            MatMulHelper(A, B, result, i, j, k + 1, m, p, n);
        }

        if (k == p - 1) {
            if (j < n - 1) {
                MatMulHelper(A, B, result, i, j + 1, 0, m, p, n);
            } else if (i < m - 1) {
                MatMulHelper(A, B, result, i + 1, 0, 0, m, p, n);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, p;
        m = sc.nextInt();
        p = sc.nextInt();
        n = sc.nextInt();
        int[][] A = new int[m][p];
        int[][] B = new int[p][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        Accio Obj = new Accio();

        int[][] Ans = Obj.MatMul(m, p, n, A, B);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
