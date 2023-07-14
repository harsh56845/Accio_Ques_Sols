// Ques Lnk :- https://course.acciojob.com/idle?question=293c3e65-fe25-4775-9d0f-b9f3ba62a7a1
import java.util.*;

class Node {

  int data;
  Node left, right;
  Node(int d) {
        data = d;
        left = right = null;
    }
}

class Solution{
	static void maker(int[] arr,int low,int high){
		if(low>high) return;
		if(low<=high){
			int mid = (low+high)>>1;
			System.out.print(arr[mid]+" ");
			maker(arr,low,mid-1);
			maker(arr,mid+1,high);
		}
		
	}
    static void sortedArrayToBST(int arr[], int n){
        // Your code here
		maker(arr,0,n-1);
    }
}
public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node(data);
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Solution.sortedArrayToBST(tree, n);
  }
}
