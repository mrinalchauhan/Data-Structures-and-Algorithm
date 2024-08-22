public class RecursiveBubbleSort {
    public static void bubble(int arr[],int n,int i){
               if(i==0)
                return;

           while(i>0){
            
           for(int j=0;j<i;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                  
               }
           }
            i--;
        }
        bubble(arr,n,i);
   }
   public static void main(String args[]){
       int arr[]={2,5,1,8,6,9};
       int n=arr.length;
       int i=0;
       bubble(arr, n,i);
       for(int m=0;m<n;m++){
           System.out.print(arr[m]+" ");
       }
   }
}


