// searching the target valuue using binary seacrch

// ITERATIVE APPROACH
// T.C=Let’s derive the number of divisions mathematically,

// If a number n can be divided by 2 for x times:
// 	2^x = n
// Therefore, x = logn (base is 2)
// So the overall time complexity is O(logN), where N = size of the given

// class searchX{
//     static void function(int targetX,int arr[]){
//       int start=0;
//       int n=arr.length;
//       int end=n-1;
//       int mid=0;
//       while(start<=end){
//         mid=(start+end)/2;   // this part should be inside the while loop
//       if(arr[mid]==targetX){
//         System.out.println("value found at index value "+mid);
//         return; // exits the function when value is found
//       }
//       else if(arr[mid]<targetX){
//         start=mid+1;

//       }
//       else{
//         end=mid-1;
//       }
      
//     }
        
//    System.out.println("value not found");
// }

//     public static void main(String args[]){
//      int arr[]={1,3,4,5,9,22,44};
//      function(3,arr);
     
//     }
// }

//RECURSIVE APPROACH
// T.C=O(logN)base 2 ..reason same as iterative approach
class searchX{
    static int recursive(int arr[],int target,int start,int end){
         int mid=0;
         mid =(start+end)/2;

         if(start>end)  // base case 
          return -1;

         if(arr[mid]==target){
          return mid;
         }
         else if(arr[mid]>target){
          return recursive(arr,target,start,mid-1);
         }
        else{
            return recursive(arr,target,mid+1,end);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,};
        int target=2;
        int start=0;
        int n=arr.length;
        int end=n-1;
        int res=recursive(arr,target,start,end);
        System.out.println("value found at "+res);

    }
}