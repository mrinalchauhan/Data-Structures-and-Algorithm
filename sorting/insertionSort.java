// put each element at right position by checking the adj element and swapping accordingly then from re checking from starting to current positon similarily

public class insertionSort {
    public static void insertion(int arr[],int n){
        for(int i=0;i<n-1;i++){
                int j=i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
        }
    
    public static void main(String args[]){
        int arr[]={2,5,1,8,6,9};
        int n=arr.length;
        insertion(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

