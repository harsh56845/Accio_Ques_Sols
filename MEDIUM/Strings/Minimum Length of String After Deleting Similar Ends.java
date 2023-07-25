// Ques link :- https://course.acciojob.com/idle?question=3ce558cd-62b9-47c7-9c0f-fc5c88224880
import java.util.*;

class Solution {
	static int solve(String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<=right && s.charAt(left)==s.charAt(right)){
			char ch = s.charAt(left);
			while(left<=right && ch==s.charAt(left)) left++;
			while(left<=right && ch==s.charAt(right)) right--;
		}
		
		return right-left+1;
	}
}
public class Main{
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      System.out.println(Solution.solve(s));
   }
}
