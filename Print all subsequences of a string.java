// Ques Link :- https://course.acciojob.com/idle?question=47e066fc-64ac-4ce9-ab5f-3a3d6d522765
import java.util.*;
import java.util.Scanner;

public class Main{
	static void helper(String str,String asf){
		if(str.length()==0){
			System.out.print(asf+" ");
			return;
		}
		// inclusive
		helper(str.substring(1),asf+str.charAt(0));
		// exclusive
		helper(str.substring(1),asf+"");
		
	}
    static void printSubsequence(String s) {
		helper(s,"");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}
