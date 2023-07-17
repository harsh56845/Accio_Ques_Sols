// Ques Link :- https://course.acciojob.com/idle?question=5c0ae439-fa35-402f-8d94-5a47056b7131
import java.util.*;

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

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
		StringBuilder ans = new StringBuilder();
		Queue<TreeNode> q1 = new LinkedList<>();
		q1.add(root);
		while(!q1.isEmpty()){
			TreeNode temp = q1.poll();
			if(temp==null){
				ans.append("n ");
				continue;
			}
			ans.append(temp.val).append(" ");
			q1.add(temp.left);
			q1.add(temp.right);
		}
		return ans.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String str) {
		Queue<TreeNode> q1 = new LinkedList<>();
		String[] nodes = str.split(" ");
		TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
		q1.add(root);
		for(int i=1;i<nodes.length;i++){
			TreeNode parent = q1.poll();
			if(!nodes[i].equals("n")){
				parent.left = new TreeNode(Integer.parseInt(nodes[i]));
				q1.add(parent.left);
			}
			if(!nodes[++i].equals("n")){
				parent.right = new TreeNode(Integer.parseInt(nodes[i]));
				q1.add(parent.right);
			}
		}
		return root;
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

        String s = serialize(root);
        display(deserialize(s));
    }

    public static void main(String[] args) {
        solve();
    }
}
