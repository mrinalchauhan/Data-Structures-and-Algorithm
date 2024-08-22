
// reverse an array
public class RECreverse {
    public static void reverse(int arr[],int n){
       int left=0;
       int right=n-1;

       
          while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;  
          }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverse(arr,n);
        System.out.println("Reverse array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }
