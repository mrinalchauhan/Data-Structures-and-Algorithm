// print 1 to N without using java ...return array of 1 to n integers
// coding ninja ques
import java.util.Scanner;

public class REC1toN {
    public static int[] printnos(int x){
        if(x<1){
            return new int[0];
        }
        int res[]=new int[x];
        fillarray(res,1);
        return res;
    }

    public static void fillarray(int arr1[],int i){
        if(i>arr1.length){
            return ;

        }
        arr1[i-1]=i;
        fillarray(arr1, i+1);
    }
    public static void main(String args[]){
        System.out.print("Enter the N value :");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans[]=printnos(x);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
