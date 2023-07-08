// Ques Link :- https://course.acciojob.com/idle?question=91028013-cace-4104-a833-33522013bbaf
import java.util.*;

public class Main {
    public static int[] findTheWay(int[][] arr) {
        //Write code here
		int n = arr.length;
		int m = arr[0].length;

		int i = 0;
		int j = 0;

		int[] ans = new int[2];
		
		int dir=0;

		while(j>=0 && i>=0 && i<n && j<m){
			ans[0]=i;
			ans[1]=j;
			
			if(arr[i][j]==0){
				if(dir==0){
					j++;
				}else if(dir==1){
					i++;
				}else if(dir==2){
					j--;
				}else{
					i--;
				}
				
			}else{
				arr[i][j]=0;
				if(dir==0){
					dir=1;
					i++;
				}else if(dir==1){
					dir=2;
					j--;
				}else if(dir==2){
					dir=3;
					i--;
				}else{
					dir=0;
					j++;
				}				
				
			}
		}
		return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
		}
        int result[] = findTheWay(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
