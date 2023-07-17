// Ques Link :- https://course.acciojob.com/idle?question=8c506059-47d2-4ff4-9891-df1b3ad4506b

// Brute Force approch  TC -> O(logN) SC -> (logN)
import java.util.*;

class Solution {

    static int findInverse(int n)
    {
		int num = n;
		int c = 0;
		while(num!=0){
			c++;
			num/=10;
		}
        int[] arr = new int[c];
		int pv = 1;
		while(n!=0){
			int rem = n%10;
			if(rem<=c)
			arr[rem-1] = pv;
			pv++;
			n/=10;
		}
		for(int i=c-1;i>=0;i--){
			num=num*10+arr[i];
		}
		return num;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.findInverse(n));
    }
}

// Optimsed without any extra space TC -> O(logN) , SC -> O(1)
import java.util.*;

class Solution {

    static int findInverse(int n)
    {
		int num = n;
		int c = 0;
		while(num!=0){
			c++;
			num/=10;
		}

		int in = 0;
		int pv = 1;
		while(n!=0){
			int rem = n%10;
			// checking if rem is not greter than no of digits
			if(rem<=c)
			in+= (pv)*Math.pow(10,rem-1);
			pv++;
			n/=10;
		}
		return in;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.findInverse(n));
    }
}
