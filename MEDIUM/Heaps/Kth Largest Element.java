// Ques Link :- https://course.acciojob.com/idle?question=f3750533-7b9c-4e33-8eca-393f93bff6be
// 1st approch Heaps
import java.util.*;

class Accio{
    public int KthLargestElement(int N, int K, int[] arr){
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i =0; i<arr.length ;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<K-1;i++){
            pq.remove();
        }
        return pq.peek();
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int ans=obj.KthLargestElement(n,k,nums);
        System.out.println(ans);
    }
}

// 2nd Approch divde and conqure
// import java.util.*;

// class Accio{
//     public int KthLargestElement(int N, int k, int[] arr){
//         if (arr == null || arr.length < k)
//             return -1; // Invalid input or k is out of range
        
//         int left = 0;
//         int right = arr.length - 1;
        
//         while (true) {
//             int pivotIndex = partition(arr, left, right);
            
//             if (pivotIndex == k - 1)
//                 return arr[pivotIndex];
//             else if (pivotIndex > k - 1)
//                 right = pivotIndex - 1;
//             else
//                 left = pivotIndex + 1;
//         }
//     }
	
// 	public static int partition(int[] arr, int left, int right) {
//         int pivotValue = arr[right];
//         int pivotIndex = left;
        
//         for (int i = left; i < right; i++) {
//             if (arr[i] >= pivotValue) {
//                 swap(arr, i, pivotIndex);
//                 pivotIndex++;
//             }
//         }
        
//         swap(arr, pivotIndex, right);
// 		return pivotIndex;
// 	}
	
//     public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }
	
	
// public class Main {
//     public static void main(String[] args) throws Throwable {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int nums[]=new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             nums[i] = sc.nextInt();
//         }
//         Accio obj = new Accio();
//         int ans=obj.KthLargestElement(n,k,nums);
//         System.out.println(ans);
//     }
// }
