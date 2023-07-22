// Ques Link :- https://course.acciojob.com/idle?question=0dd4bc90-7cd3-45f8-bd73-81ada8c52c67
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node constructBST(int[] arr, int start, int end, Node root) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        if (root == null)
            root = new Node(arr[mid]);

        root.left = constructBST(arr, start, mid - 1, root.left);
        root.right = constructBST(arr, mid + 1, end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);
        Node root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.constructBST(arr, 0, n - 1, root);

        Accio A = new Accio();
        if(!A.targetSum(root, target,root)) 
		System.out.println(-1);		
			

        sc.close();
    }
}

class Accio {
    public boolean containEle(Node root,int toFind){
		if(root==null) return false;
		if(root.data==toFind){
			return true;
		}
		else if(root.data>toFind){
			return containEle(root.left,toFind);
		}
		else{
			return containEle(root.right,toFind);
		}
	}
	static boolean isfound = false;
    public boolean targetSum(Node root, int tar ,Node root1)
    {
		if(root==null) {
			return false;
		}
		targetSum(root.left,tar,root1);
		if(root.data<tar-root.data)
		if(containEle(root1,tar-root.data)){
			System.out.println(root.data+" "+(tar-root.data));
			isfound = true;
			// return true;
		}
		
		targetSum(root.right,tar,root1);
		if(isfound) return true;
		return false;
		// System.out.println(-1);		
    }

}



