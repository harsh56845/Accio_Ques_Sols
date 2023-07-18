// Ques link :- https://course.acciojob.com/idle?question=51bd72c5-4874-4108-95b0-65900d4e5ef8

import java.util.*;
import java.io.*;
class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){
        
    }
    BST(Node root){
        this.root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{
    public Node deleteNode(Node root, int val){
		if(root==null) return null;

		if(root.val>val){
			root.left = deleteNode(root.left,val);
		}
		else if(root.val<val){
			root.right = deleteNode(root.right,val);
		}
		// node found
		else{
			// case 1 -> leaf node
			if(root.left==null && root.right==null){
				return null;
			}

			// case 2 -> one chlid node
			else if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}

			//case 3 -> 2 childs
			else{
			Node node = inorderSucessor(root.right);
			root.val = node.val;
			root.right = deleteNode(root.right,node.val);
			}
		}
		
		return root;
    }

	Node inorderSucessor(Node root){
		while(root.left!=null) root = root.left;
		return root;
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        t.root= obj.deleteNode(t.root, k);
        t.print(t.root);
    }
}
