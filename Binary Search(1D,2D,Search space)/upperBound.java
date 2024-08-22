//upper bound, it is arr[ind] > x.
//brute force approach
// T.C= O(N)  linear search
//S.C=O(1)  

// public class upperBound {
//     public static int brute(int arr[],int x){
//         int n=arr.length;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>x){
//               return i;
//             }
//             }
//             return n;
//         }
//         public static void main(String args[]){
//             int arr[]={3,5,7,10,12};
//             int x=5;
//             int res=brute(arr, x);
//             System.out.println("upper bound is at index "+res);

//         }
//     }
    
// optimal approach
// binary search
//T.C=O(log N)   binary search
//S.C=O(1)
 public class upperBound{
    public static int optimal(int arr[],int x){
        int s=0;
        int n=arr.length;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid=(s+e)/2;
             if(arr[mid]>x){
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
        int arr[]={3,4,7,9,12,14,17};
        int x=8;
        int res=optimal(arr, x);
        System.out.println("upper found found at "+res);


    }

 }

