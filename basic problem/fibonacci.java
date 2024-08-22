
//Print Fibonacci Series up to Nth term
//T.O(N)
//S.C=O(N)
public class fibonacci {
    public static void fibonacciii(int n){
        
        int f[]=new int[n];
        f[0]=0;
        f[1]=1;
        System.out.print(f[0]+" ");
        System.out.print(f[1]+" ");
        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
            System.out.print(f[i]+" ");

        }
        System.out.println(" ");
        System.out.println("4 th term is ");
        System.out.println(f[4]);
         }
    public static void main(String args[]){
        System.out.println("Fibonaaci series ");
       fibonacciii(9);
    }
}
