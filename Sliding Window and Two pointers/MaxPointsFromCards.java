// Maximum points you obtain from cards 

/* There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
  */
  
public class MaxPointsFromCards {
    public static int points(int arr[], int k ){
        int maxsum=0;
        int leftsum=0;
        int rightsum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            leftsum=leftsum+arr[i];
            maxsum=leftsum;
        }
        int right=n-1;
        for(int j=k-1;j>=0;j--){
            leftsum=leftsum-arr[j];
            rightsum=rightsum+arr[right];
            int total=leftsum+rightsum;
            maxsum=Math.max(maxsum,total);
        }
        return maxsum;
    }
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,1};
    int k=3;
    int ans=points(arr,k);
    System.out.println("maximum points obtained in given array ="+ans);

    }
}
