public class palindrome {
    public static void palin(){
        int num=525;
        int n=num;
        int s=0;
        while(n>0){
           int r=n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
         if(num==s){
            System.out.println("yes it is pallindrome");
         }
            else{
            System.out.println("no it is not a palindrome");
            }
         }
    
    public static void main(String args[]){
        palin();
    }
}

