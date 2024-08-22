
/* 
public class armstrong {
    public static int armstrongNum(int num){
        int n=num;
        String str=Integer.toString(num);
        int l=str.length();
        int s=0;
        while(n>0){
          int r=n%10;
          s=s+(r*(int)Math.pow(r,l));
          num=num/10;
        }
        return s;
    }
    public static void main(String args[]){
      int num=153;
        int ans=armstrongNum(num);
        System.out.println(ans);
        if(ans==num){
            System.out.println("yes it is armstrong");

        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}      */

public class armstrong {
    public static double armstrongNum(int num){
        int n=num;
        int temp=num;
        int c=0;
        
        while(temp!=0){
          c++;
          temp=temp/10;

        }
        double s=0;

        while(n!=0){
    
          int r=n%10;
          s=s+Math.pow(r,c);
          num=num/10;
        }
        return s;
    }
    public static void main(String args[]){
      int num=153;
       double ans= armstrongNum(num);
        System.out.println(ans);
        if(ans==num){
            System.out.println("yes it is armstrong");

        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}