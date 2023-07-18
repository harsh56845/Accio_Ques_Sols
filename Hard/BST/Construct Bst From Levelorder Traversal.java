// Ques Link :- https://course.acciojob.com/idle?question=78d88a42-f9ae-4454-a580-518034855d54
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Main {

    static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Node ans = Obj.bstFromLevel(arr, n);
        printLevelOrder(ans);
        sc.close();
    }
}

class Solution {
    Node bstFromLevel(int arr[], int n) {
        // write code here
		Queue<Pair>Q=new ArrayDeque<>();
		int idx=0;
		Node root=new Node(arr[idx]);
		if(n==1) return root;
		Q.add(new Pair(root,Integer.MIN_VALUE,root.data-1));
		Q.add(new Pair(root,root.data+1,Integer.MAX_VALUE));
		idx++;
		while(Q.size()>0) {
			Pair removed=Q.remove();
			if(removed.l<=arr[idx] && arr[idx]<=removed.r){
				Node node=new Node(arr[idx]);
				Q.add(new Pair(node,removed.l,node.data-1));
				Q.add(new Pair(node,node.data+1,removed.r));
				if(arr[idx]<removed.node.data){
					removed.node.left=node;
				}
				else removed.node.right=node;
				if(idx<n-1) idx++;
			}
			else continue;	
		}
		return root;
    }
	
	class Pair {
		Node node;
		int l;
		int r;
		Pair(Node n,int l,int r){
			node=n;
			this.l=l;
			this.r=r;
		}
	}
}
