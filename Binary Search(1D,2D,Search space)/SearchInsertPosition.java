//Problem Statement: You are given a sorted array arr of distinct values and a target value x. You need to search for the index of the target value in the array.
//If the value is present in the array, then return its index. Otherwise, determine the index where it would be inserted in the array while maintaining the sorted order.
// brute force
//T.C=O(N)
//S.C=O(1)
// public class SearchInsertPosition {
//     public static void search(int arr[],int x){
//         int ans=0;
//         for(int i=0;i<arr.length-1;i++){          
//            if(arr[i]<x){
//               ans=i;
//             } 
//         }
//        System.out.println("target value should be present after "+ans); 
//     }
//     public static void main(String args[]){
//         int arr[]={1,2,4,7};
//         int x=7;
        
//        search(arr, x);
//     }
    
// }

// optimal approach
// binary search
//T.C=O(LOG N)
//S.C=O(1)
public class SearchInsertPosition{
    public static int binarySearch(int arr[],int x){
        int s=0;
        int n=arr.length-1;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>=x){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,7};
        int x=5;
        int res=binarySearch(arr, x);
        System.out.println("value will at index position "+res);
    }
}