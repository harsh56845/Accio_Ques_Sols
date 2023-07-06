// Ques Link :- https://course.acciojob.com/idle?question=07b3410f-a523-4fac-a547-663e6e2a397e

import java.util.*;

public class Main {
    public static String MessageEncrypt(String s, int k) {
        StringBuilder sb = new StringBuilder();
		while(s.length()>=2*k){
			String temp = s.substring(0,k);
			sb.append(new StringBuilder(temp).reverse());
			sb.append(s.substring(k,2*k));
			s=s.substring(2*k);
		}

		if(s.length()<=k){
			sb.append(new StringBuilder(s).reverse());
		}else{
			sb.append(new StringBuilder(s.substring(0,k)).reverse());
			sb.append(s.substring(k));
		}

		return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(MessageEncrypt(s, k));
    }
}
