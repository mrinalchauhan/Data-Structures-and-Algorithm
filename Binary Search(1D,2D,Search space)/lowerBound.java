//The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x or target.
//The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.

// Time Complexity: O(N), where N = size of the given array.
// Reason: In the worst case, we have to travel the whole array. This is basically the time complexity of the linear search algorithm.

// Space Complexity: O(1) as we are using no extra space.
/* public class lowerBound {
    static int function(int arr[],int target){
      int n=arr.length;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
        System.out.println("target found at");
        return i;
        }
        else if(arr[i]>target){       // arr[mid]>=x   this can be written as o+-
           System.out.println("just greater than target value "+ arr[i] + " found at index " + i);
            return i;
        }
    }
    System.out.println("index not found");
    return n;
}
    public static void main(String args[]){
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        int ind = function(arr, x);
        System.out.println(ind);
    }
}    */

// optimal approach 
// Time Complexity: O(logN), where N = size of the given array.
// Reason: We are basically using the Binary Search algorithm.

// Space Complexity: O(1) as we are using no extra space.
public class lowerBound{
    public static int approach(int arr[],int x){
        int s=0;
        int n=arr.length;
        int e=n-1;
        int ans=n;
        while(s<=e){
            int mid=(s+e)/2;

            if(arr[mid]>=x){
                ans= mid;
               
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={3,9,12,14,15};
        int x=2;
        int res=approach(arr, x);
        System.out.println("lower bound found at index "+res);
    }
}
