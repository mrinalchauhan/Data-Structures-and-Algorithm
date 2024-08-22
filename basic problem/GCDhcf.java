/* 
// brute force approach
public class GCDhcf {
    public static void hcf(){
        int n1=18;
        int n2=27;
        int max=0;
             System.out.print("the common factors are ");
        for(int i=1;i<Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
           
             System.out.print(i+" , ");
            
        
             max=Math.max(max,i);
        }
    }

             System.out.println(" the highest common factor is "+max);

        }
    
    
    public static void main(String args[]){
        hcf();

    }
}
    */
  public class GCDhcf {
    public static int hcf(int n1,int n2){
        
        if(n2==0){
            return n1;
        }
        else{
           return hcf(n2,n1%n2);
            
    }
}
    public static void main(String args[]){
      int n1=18;
       int n2=27;
      int ans= hcf(n1,n2);
      System.out.println(ans);
    }
   
  }