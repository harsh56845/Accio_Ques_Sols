// QL :- https://course.acciojob.com/idle?question=570d8943-8fce-4bdd-8092-83fb3935ab63
// TC -> O(m * p * n) SC-> O(m * n)

import java.util.*;

class Accio {
    // Recursive matrix multiplication function
    public int[][] MatMul(int m, int p, int n, int[][] A, int[][] B) {
        // Initialize the result matrix to store the product of A and B
        int[][] result = new int[m][n];
        // Call the helper function to perform matrix multiplication
        MatMulHelper(A, B, result, 0, 0, 0, m, p, n);
        // Return the resulting matrix
        return result;
    }

    // Helper function for recursive matrix multiplication
    private void MatMulHelper(int[][] A, int[][] B, int[][] result, int i, int j, int k, int m, int p, int n) {
        // Base case: if any index goes out of bounds, return
        if (i >= m || j >= n || k >= p)
            return;

        // Recursive step: perform multiplication and add to the result matrix
        if (k < p) {
            result[i][j] += A[i][k] * B[k][j];
            MatMulHelper(A, B, result, i, j, k + 1, m, p, n);
        }

        // Check if we reached the end of a row in the result matrix, move to the next row/column
        if (k == p - 1) {
            if (j < n - 1) {
                // Move to the next column
                MatMulHelper(A, B, result, i, j + 1, 0, m, p, n);
            } else if (i < m - 1) {
                // Move to the next row and first column
                MatMulHelper(A, B, result, i + 1, 0, 0, m, p, n);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n, p;
        // Input dimensions of matrices m, p, and n
        m = sc.nextInt();
        p = sc.nextInt();
        n = sc.nextInt();
        // Initialize matrices A and B with given dimensions
        int[][] A = new int[m][p];
        int[][] B = new int[p][n];

        // Input elements of matrix A
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input elements of matrix B
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Create an instance of the Accio class
        Accio Obj = new Accio();

        // Perform matrix multiplication using recursion
        int[][] Ans = Obj.MatMul(m, p, n, A, B);

        // Output the resulting matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

