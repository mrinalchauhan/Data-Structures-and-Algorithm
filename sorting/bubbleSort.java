// bring the maximum element to last by swapping with only adj element

public class bubbleSort {
    public static void bubble(int arr[],int n){
         for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         }
    }
    public static void main(String args[]){
        int arr[]={2,5,1,8,6,9};
        int n=arr.length;
        bubble(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
