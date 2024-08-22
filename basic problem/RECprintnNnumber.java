
// print 1 to n using recursion
public class RECprintnNnumber {
    public static void print(int i,int n){
     if(i>n){
        return;
     }

        int c=i;
        System.out.print(c+" ");
        print(i+1,n);
    }
    public static void main(String args[]){
        int i=1;
        int n=6;
        print(i,n);
    }
}
