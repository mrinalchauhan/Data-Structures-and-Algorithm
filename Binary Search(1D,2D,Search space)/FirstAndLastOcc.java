// Given a sorted array arr of n integers and a target value k. Write a program to find the indices of the first and the last occurrences of the target value. If the target is not found then return -1 as indices.

// USING ARRAYLIST

// approach 1- linear search
// Time Complexity: O(N), N = size of the given array
// Reason: We are traversing the entire array.

// Space Complexity: O(1) as we are not using any extra space.
// import java.util.ArrayList;
// import java.util.Arrays;

// public class FirstAndLastOcc {
//     public static int[] occ(ArrayList<Integer> arr,int t){
//         int first=-1;
//         int last=-1;
        
//         for(int i=0;i<arr.size();i++){
//             if(arr.get(i)==t){
//                   if(first==-1){
//                     first=i;
//                   }
//             last=i;
//             }
//         }
//     int res[]={first,last};
//     return res;
//     }
//     public static void main(String args[]){
//     ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
//         int k = 8;
//         int[] ans = occ(arr, k);
//         System.out.println("The first and last positions are: "
//                            + ans[0] + " " + ans[1]);
//     }
// }

// approach 2-  binary search
// same as upper bound = ceil  & lower bound = floor
// T.C=O(2*logN)   // two times binary search used
// S.C=O(1)
import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOcc{
    public static int last(ArrayList<Integer>arr ,int t){
        int s=0;
        int e=arr.size()-1;
        int ans=-1;  // initialising it with -1 as it is told to print -1 when none of digits satisfy the condition
        while(s<=e){
            int mid=(s+e)/2;
            if(arr.get(mid)<=t){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static int first(ArrayList<Integer>arr,int t){
        int s=0;
        int e=arr.size()-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
                if(arr.get(mid)>=t){
                   ans=mid;
                   e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {2, 4, 6, 8, 8, 8, 11, 13}));
        int t = 8;
        int f=first(arr,t);
        int l=last(arr,t);
        
        int[] ans = {f,l};
        System.out.println("The first and last positions are: "
                           + ans[0] + " " + ans[1]);
    }
    }

