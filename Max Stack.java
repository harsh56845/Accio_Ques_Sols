// Ques Link :- https://course.acciojob.com/idle?question=a4ded56a-218c-4b97-bea0-763868b7a0c3
import java.util.*;

 class MaxStack {
	ArrayList<Integer> arr;
	public MaxStack() {
		arr = new ArrayList<>();
	}

	public void Push(int value) {
		arr.add(0,value);
	}

	// Return the popped element.
	public int Pop() {
		if(arr.size()==0) return -1;
		int rm = arr.get(0);
		arr.remove(0);
		return rm;
	}

	// Return value at the top of stack.
	public int Top() {
		if(arr.size()==0) return -1;
		return arr.get(0);
	}

	// Return maximum value in stack.
	public int getMax() {
		int high = Integer.MIN_VALUE;
        if (arr.size() == 0)
            return -1;
        else
            for (int i : arr) {
                high = Math.max(high, i);
            }
        return high;
	}

} 


public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in); 
        int q = sc.nextInt(); 
        
        MaxStack maxst = new MaxStack(); 

        while(q-- >0){
            
             int type = sc.nextInt(); 
             if(type==1){
                 int val = sc.nextInt(); 
                 maxst.Push(val);  
             }else if(type==2){
                 maxst.Pop(); 
             }else if(type==3){
                 System.out.println(maxst.Top()); 
             }else{
                 System.out.println(maxst.getMax()); 
             }
        }
    }
}
