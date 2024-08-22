public class RECsumOfNnum { 
   static  int s=0;

    public static int sum(int i,int n){
      
        if(i>n){
            return 0;
        }
        
         s=s+i;
       
        sum(i+1,n);
    
        return s;
    }
      

    public static void main(String args[]){
        int i=1;
        int n=5;
        int ans=sum(i,n);
        System.out.println("Sum is "+ans);
    }
}
