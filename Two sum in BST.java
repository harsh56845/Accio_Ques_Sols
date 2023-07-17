// Q :- https://course.acciojob.com/idle?question=8b9059a2-281c-4f68-b038-6e7cd889f558
import java.util.*;

class Node {
    int val;
    Node left, right;
    public Node(int item){
        val = item;
        left = right = null;
    }
}

class BinarySearchTree
{
    Node constructBST(int[]arr,int start,int end,Node root)
    {
        if(start>end)return null;
        int mid=(start+end)/2;
        if(root==null)root=new Node(arr[mid]);
        root.left=constructBST(arr,start,mid-1, root.left);
        root.right=constructBST(arr,mid+1,end, root.right);
        return root;
    }
}

class Solution{
    public static boolean checkTarget(Node root, int k) {
        //write code here
		HashSet<Integer>set=new HashSet<>();
		fill(set,root);
		for(int keys:set){
			if(set.contains(k-keys)==true){
				// System.out.println("found:"+keys+" "+(keys-k));
				return true;
			}
			// set.add()	
		}
		return false;
    }
	static void fill(HashSet<Integer>set,Node root){
		if(root==null){
			return ;
		}
		set.add(root.val);
		fill(set,root.left);
		fill(set,root.right);
	}
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); 
        }
        Node root=null;
        BinarySearchTree bst=new BinarySearchTree();
        root=bst.constructBST(arr,0,n-1,root);
        Solution A = new Solution();
        boolean ans = A.checkTarget(root,k);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
