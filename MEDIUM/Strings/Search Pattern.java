// Ques Link :- https://course.acciojob.com/idle?question=7e2f8ed3-69ab-4d0c-ad56-467a99335a5b
import java.util.*;

class Solution {
	 public static List<Integer> FindIndices(String a, String b) {
        List<Integer> indices = new ArrayList<>();
        int n = a.length();
        int m = b.length();
        int prime = 31;
        int mod = (int) 1e9 + 9;

        if (n < m) {
            indices.add(-1);
            return indices;
        }

        long bHash = 0;
        long currHash = 0;
        long pow = 1;

        for (int i = 0; i < m; i++) {
            bHash = (bHash * prime + b.charAt(i)) % mod;
            currHash = (currHash * prime + a.charAt(i)) % mod;
            if (i != 0)
                pow = (pow * prime) % mod;
        }

        for (int i = 0; i + m - 1 < n; i++) {
            if (currHash == bHash && isEqual(a, i, i + m - 1, b)) {
                indices.add(i + 1);
            }
            if (i + m < n) {
                currHash = (prime * (currHash - a.charAt(i) * pow) + a.charAt(i + m)) % mod;
                if (currHash < 0)
                    currHash += mod;
            }
        }

        if (indices.isEmpty())
            indices.add(-1);

        return indices;
    }

    private static boolean isEqual(String str, int start, int end, String pattern) {
        for (int i = 0; i < pattern.length(); i++) {
            if (str.charAt(start + i) != pattern.charAt(i))
                return false;
        }
        return true;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
	    Solution Obj = new Solution();
        List<Integer> ans = Obj.FindIndices(a, b);
		if(ans.size()==0)
            System.out.print(-1);
		else
        for(int x : ans)
            System.out.print(x + " ");
    }
}
