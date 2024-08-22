/* 
// factorial 
public class RECfactorial {
     static int fact=1;
    public static void factorial(int n){
    
      for(int i=n;i>0;i--){
        fact=fact*i;
      }
     System.out.println(fact);
    }
    public static void main(String args[]){
        factorial(4);
    }
}  
*/
 
// using recursion  ..factorial 
public class RECfactorial {
     static int fact=1;
    public static int factorial(int n){
        if(n<1){
            return 0;
        }
        fact=fact*n;
       
        factorial(n-1);
         return fact;
      
    }
    public static void main(String args[]){
       int ans= factorial(4);
       System.out.println("Factorial is "+ans);
    }
}  
