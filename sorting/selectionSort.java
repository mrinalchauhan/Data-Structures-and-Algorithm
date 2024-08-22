// in this sorting..we find minimum element from whole array at each stage and put it in the stating position.

public class selectionSort{
    public static void selection(int arr[],int n){
        int min=0;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        
        

    
    
    public static void main(String args[]){
        int arr[]={2,9,3,8,5,7,1};
        int n=arr.length;
        
        selection(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}