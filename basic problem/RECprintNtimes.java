public class RECprintNtimes {
     static  int c=0;
    public static void rec(){
 
        if(c==5){
            return;
        }
    
   
     System.out.println(c);
     c=c+1;
     rec();

    }
    public static void main(String args[]){
        
        rec();
    }
}
