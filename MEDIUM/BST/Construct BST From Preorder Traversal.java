// Ques Link :- https://course.acciojob.com/idle?question=990a7311-5449-47ed-8b8d-9d152e0ed3f8
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode helper(int[] preOrder, int start, int end) {
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[start]);

        int i;
        for (i = start + 1; i <= end; i++) {
            if (preOrder[i] > root.val) {
                break;
            }
        }

        root.left = helper(preOrder, start + 1, i - 1);
        root.right = helper(preOrder, i, end);

        return root;
    }

    public static TreeNode CreateTree(int n, int[] preOrder) {
        return helper(preOrder, 0, n - 1);
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n, pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
