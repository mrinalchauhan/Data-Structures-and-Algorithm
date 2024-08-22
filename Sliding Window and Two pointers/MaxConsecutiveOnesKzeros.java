//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//Output: 6
//Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// numbers were flipped from 0 to 1. The longest subarray is underlined.
 
public class MaxConsecutiveOnesKzeros {
    public static int function(int nums[],int k){
        int start=0;
        int zeroCount=0;
        int maxlen=0;
        for(int end=0;end<nums.length;end++){
             if(nums[end]==0){
                zeroCount++;
             }
             while(zeroCount>k){
                if(nums[start]==0){
                    zeroCount--;
                }
                start++;
             }
             maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
    public static void main(String args[]){
        int arr[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int ans=function(arr,k);
        System.out.println("length is "+ans);
    }
}
