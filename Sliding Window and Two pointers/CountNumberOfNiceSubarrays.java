/*Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
Return the number of nice subarrays */

// normal sliding window wont work here so modified sliding window is used same as Binary sub-arrray with sum question
public class CountNumberOfNiceSubarrays {

    public static int function(int arr[],int k){
           return atmost(arr,k)-atmost(arr, k-1);
    }
    public static int atmost(int arr[],int k){
         int start=0;
         int oddcount=0;
         int subarray=0;
         for(int end=0;end<arr.length;end++){
            if(arr[end]%2==1){
                oddcount++;
            }
            while(oddcount>k && start<=end){
                if(arr[start]%2==1){
                    oddcount--;
                }
                start++;
            }
            subarray +=end-start+1;
         }
         return subarray;
    }
    public static void main(String args[]){
       int arr[]={1,1,2,1,1};
       int k=3;
       int ans=function(arr, k);
       System.out.println("number of nice subarray is "+ans);
    }
}
