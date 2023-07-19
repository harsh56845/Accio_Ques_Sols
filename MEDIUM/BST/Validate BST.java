// Ques Link :- https://course.acciojob.com/idle?question=3b992182-31dd-4aaa-a4fd-914a6a9669ff
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;


class Solution{
	static ArrayList<Integer> ar = new ArrayList<>();
	void print(Node root){
		if(root == null){
			return;
		}
		print(root.left);
		ar.add(root.data);
		// System.out.print(root.data+" ");
		print(root.right);

	}
    boolean isBST(Node node){
       print(node);
		for(int i=1;i<ar.size();i++){
			if(ar.get(i-1)>ar.get(i)){
				return false;
			}
		}
		return true;
    }
}


class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Main {
    static Node treeBuilder(String str){  
        if(str.length()==0 || str.charAt(0)=='-'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("-1")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("-1")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    
  public static void main (String[] args) throws IOException{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int t=Integer.parseInt(br.readLine());
          while(t > 0){
              String s = br.readLine();
            Node root = treeBuilder(s);
              Solution g = new Solution();
              if(g.isBST(root))
              System.out.println("true");
          else
              System.out.println("false");
                t--;
        }
    }
  
}


