// Ques Link :- https://course.acciojob.com/idle?question=8eb53aa6-bb90-4a5c-8995-b4a8383dc4ee
import java.util.*;

public class Main {

    public static String removeparentheses(String S, int n) {
		Stack<Character> st = new Stack<>();
		StringBuilder temp = new StringBuilder();
		for(char ch:S.toCharArray()){
			if(st.size()==1 && st.peek()=='(' && ch==')'){
				st.pop();
			}
			else {
				if(st.isEmpty() && ch=='('){
					st.push(ch);
				}
				else if(ch=='('){
					st.push(ch);
					temp.append(ch+"");
				}
				else{
					st.pop();
					temp.append(")");
				}
			}
		}
		return temp.toString();
	}

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s = sc.next();
		System.out.println(removeparentheses(s, n));
    }
}
