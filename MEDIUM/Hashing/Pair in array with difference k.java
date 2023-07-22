// Ques Link :- https://course.acciojob.com/idle?question=9622e528-95ed-40e3-817b-52f209455545
import java.io.*;
import java.util.*;

class Solution
{
    public int findPairs(int[] nums,int n, int k) {
		int count = 0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i:nums)
			map.put(i,map.getOrDefault(i,0)+1);
		
		for(int i:map.keySet()){
			if(map.containsKey(i-k)){
				if(i!=(i-k) || i==(i-k) && map.get(i-k)>1)
				count++;
			}
		}
		return count;
    }
}

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.findPairs(a,n,k));		    
    }
}

