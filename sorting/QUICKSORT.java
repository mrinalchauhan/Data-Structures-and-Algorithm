import java.util.*;
public class QUICKSORT {
    public static int partition(List<Integer>arr,int low,int high){
        int pivot=arr.get(low);
        int i=low;
        int j=high;
        
    while(i<j){
        while(pivot>=arr.get(i)){
           i++;
        }
        while(pivot<arr.get(j)){
            j--;
        }
       //swap(i,j) not crossing
       if(i<j){
        int temp=arr.get(i);
       arr.set(i,arr.get(j));
       arr.set(j,temp);
       }
    }
      // pivot and v crossing
      
        int temp=arr.get(low);
        arr.set(low,arr.get(j));
        arr.set(j,temp);

      return j;
    }
    public static void quicksort(List<Integer> arr,int low ,int high){
        if(low<high){
        int partitionIndex=partition(arr,low,high);
        quicksort(arr,low,partitionIndex-1);
        quicksort(arr,partitionIndex+1,high);
    }
    }
    public static List<Integer> qsSorted(List<Integer>arr){
        quicksort(arr,0,arr.size()-1);
        return arr;
    }
    public static void main(String args[]){
        List<Integer>arr=new ArrayList<>();
        arr=Arrays.asList(new Integer[]{4,6,2,5,7,9,1,3});
       List<Integer>ans= qsSorted(arr);
       System.out.println("Quick sort");
       for(int i=0;i<ans.size();i++){
       System.out.print(ans.get(i)+" ");
       }
    } 
}
