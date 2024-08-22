// Floor and Ceil in Sorted Array
// Problem Statement: You’re given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

// linear search 
//T.C=O(N) for floor and ceil seperately
//S.C=O(1)

// public class FloorAndCeil {
//     public static void floor(int arr[],int x){
//         int ans=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]<=x){
//                 ans=arr[i];
//             }
//         }
//         System.out.println("floor of the target value is "+ans);
//     }
//     public static void ceil(int arr[],int x){
//         int ans=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>=x){
//                 ans=arr[i];
//             }
//         }
//         System.out.println("ceiling of the target valuue is "+ans);
//     }
//     public static void main(String args[]){
//         int arr[]={3,4,4,8,10};
//         int x=4;
//         floor(arr, x);
//         ceil(arr, x);

//     }
// }

// optimal approach
//binary search

public class FloorAndCeil{
    public static int floor(int arr[],int x){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]<=x){
                ans=arr[mid];

             s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return ans;
    }
    public static int ceil(int arr[],int x){
        int s=0;
        int n=arr.length;
        int e=n-1;
        int ans=0;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>=x){
                ans=arr[mid];

            e=mid-1;
            }
            else{
               s=mid+1; 
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={3, 4, 4, 7, 8, 10};
        int x=5;
        int res1=floor(arr,x);
        int res2=ceil(arr,x);
        System.out.println("floor of the array is "+res1);
        System.out.println("Ceiling of the array is "+res2);
    }
}


// coding ninja

// import java.util.* ;
// import java.io.*; 

// public class Solution {
//     public static int floorr(int a[],int x){
//       int s=0;
//       int n=a.length;
//       int e=n-1;
//       int ans=-1;
      
//       while(s<=e){
//         int mid=(s+e)/2;
//         if(a[mid]<=x){
//           ans=a[mid];
           
//           s=mid+1;
//         }
//         else{
//           e=mid-1;
//         }
         
//       }
//       return ans;
//     }
//     public static int ceill(int a[],int x){
//       int s=0;
//       int n=a.length;
//       int e=n-1;
//       int ans=-1;
//       while(s<=e){
//        int mid=(s+e)/2;
//        if(a[mid]>=x){
//          ans=a[mid];

//          e=mid-1;
//        }
//        else{
//          s=mid+1;
//        }
//       }
//       return ans;
//     }
//     public static int[] getFloorAndCeil(int[] a, int n, int x) {
//         int floor=floorr(a, x);
//         int ceil=ceill(a,x);
//         int res[]={floor,ceil};
//          n=a.length;
//         return res;
//     }
    
// }