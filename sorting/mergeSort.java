import java.util.*;
public class mergeSort {
    public static void merge(int arr[],int low,int mid,int high){
    
        ArrayList<Integer> temp=new ArrayList<>();
        int p1=low;
        mid=(low+high)/2;
        int p2=mid+1;
       // base case
        if(low==high){
            return;
        }
        while(p1<=mid && p2<=high){
            if(arr[p1]<=arr[high]){
                temp.add(arr[p1]);
                p1++;
            }
            else{
                temp.add(arr[p2]);
                p2++;
            }
        }
        while(p1<=mid){
            temp.add(arr[p1]);
            p1++;
        }
        while(p2<=high){
            temp.add(arr[p2]);
            p2++;
        }
        // putting back to arr[i]
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);    // this part didnt understand

        }

    }
    public static void mergesort(int arr[],int low,int high){
        int mid=(low+high)/2;

        //base case
        if(low==high){
            return;
        }
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);


    }
    public static void main(String args[]){
        int arr[]={4,2,1,6,7};
        int n=arr.length;
        System.out.println("merge sort");
        mergesort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

    }
}
