// Ques Link :- https://course.acciojob.com/idle?question=5c814944-2552-47b2-999d-e85df0cba97f
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
	public static TreeNode prev = new TreeNode(-99999);
	public static TreeNode first = null;
	public static TreeNode middle = null;
	public static TreeNode last = null;
	// public static prev = null;

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

	public static void inorder(TreeNode root){
		if(root==null) return;

		inorder(root.left);

		if(prev!=null && root.val<prev.val){
			if(first==null){
				first = prev;
				middle = root;
			}
			else{
				last = root;
			}
		}
		prev = root;
		inorder(root.right);
	}

    public static void recoverTree(TreeNode root) {
        inorder(root);
		if(first!=null && last!=null){
			int temp = first.val;
			first.val = last.val;
			last.val = temp;
		}
		else if(first!=null && middle!=null){
			int temp = first.val;
			first.val = middle.val;
			middle.val = temp;
		}
    }

    // input_section=================================================

    public static void display(TreeNode node) {
        if (node == null)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));

        System.out.println(sb.toString());

        display(node.left);
        display(node.right);

    }

    public static TreeNode createTree(int[] arr, int[] IDX) {
        if (IDX[0] > arr.length || arr[IDX[0]] == -1) {
            IDX[0]++;
            return null;
        }

        TreeNode node = new TreeNode(arr[IDX[0]++]);
        node.left = createTree(arr, IDX);
        node.right = createTree(arr, IDX);

        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int[] IDX = new int[1];
        TreeNode root = createTree(arr, IDX);
        recoverTree(root);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
