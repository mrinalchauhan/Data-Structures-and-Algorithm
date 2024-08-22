/* Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
A subarray is a contiguous part of the array.
  */
// cannot be solved using normal sliding window
// public static int atmost(int arr[], int k){
//     int start=0;
//     int sum=0;
//     int subarray=0;
//     for(int end=0;end<arr.length;end++){
//         sum +=arr[end];
//         if(sum==goal){
//             res++;
//         }
//       while(sum>goal){    as in array [1,0,1,0,1] when start reaches index 1 i.e 0 and end is at last ..sum is not greater than goal but to obtain [1,0,1] start should move forward which does not happen here ..so this approach is not suitable
//           sum=sum-arr[start];
//           start++;
//     }
//   }
//     return res;

public class BinarySubArrayWithSum {
    public static int function(int arr[], int k){
        return atmost(arr,k)-atmost(arr,k-1);
    }
    public static int atmost(int arr[], int k){
        int start=0;
        int sum=0;
        int subarray=0;
        for(int end=0;end<arr.length;end++){
            sum +=arr[end];
            while(sum>k && start<=end){
                sum=sum-arr[start];
                start++;
            }
        subarray +=end-start+1;
        }
        return subarray;
    }
    public static void main(String args[]){
      int arr[]={1,0,1,0,1};
      int k=3;
      int ans=function(arr, k);
      System.out.println("binary subarray with sum is "+ans);
    }
}
