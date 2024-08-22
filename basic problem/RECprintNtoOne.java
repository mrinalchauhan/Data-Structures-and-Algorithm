// print n to 1 using rec

public class RECprintNtoOne {
    public static void  print(int n,int i){

        if(n<i){
            return;
        }
         int c=n;
        System.out.print(c+" ");
        print(n-1,i);
    }
    public static void main(String args[])
{   int n=5;
    int i=1;
   print(n,i);
}    
}
