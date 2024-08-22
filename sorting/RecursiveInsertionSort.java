public class RecursiveInsertionSort {
    public static void RecInsertion(int arr[],int n,int i){
        if( i==n)
        return;

                int j=i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            
    RecInsertion(arr,n,i+1);
        }
    
    public static void main(String args[]){
        int arr[]={2,5,1,8,6,9};
        int n=arr.length;
        int i=0;
        RecInsertion(arr, n,i);
        for(int m=0;m<n;m++){
            System.out.print(arr[m]+" ");
        }
    }
}

