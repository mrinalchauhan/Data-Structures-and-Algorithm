
// check prime or not
//brute force
//T.C=O(n)
//S.C=O(1)
/* 
public class prime {
    public static int primenum(int n){
      for(int i=2;i<n;i++){
        if(n%i==0){
            return 0;
        }
    }
     return 1; 
}
    public static void main(String args[]){
    
         int n=7;
         int ans=primenum(n);
         
         if(ans==0){
            System.out.println("Not prime");
         }
         else{
            System.out.println("prime number");
         }
        } 
}
*/
//optimal solution
//Time Complexity: O(√n)

//Space Complexity: O(1)
public class prime {
    public static int primenum(int n){
        double sqrt=Math.sqrt(n);
      for(int i=2;i<=sqrt;i++)
        if(n%i==0){
            return 0;
        }
            return 1;
        }
    

    public static void main(String args[]){
    
         int n=9;
         int ans=primenum(n);
         
         if(ans==0){
            System.out.println("Not prime");
         }
         else{
            System.out.println("prime number");
         }
        } 
}