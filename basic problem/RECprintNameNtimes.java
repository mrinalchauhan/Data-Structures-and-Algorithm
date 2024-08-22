public class RECprintNameNtimes {
    
public static void name(int i,int n)
{      
    if(i>n){
        return;
    }


    System.out.println("Mrinal");
    name(i+1,n);

}   
public static void main(String args[]){
    int i=0;
    int n=5;
    name(i,n);
} 
}
