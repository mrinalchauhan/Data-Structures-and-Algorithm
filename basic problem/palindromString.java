//Check if the given String is Palindrome or not
public class palindromString {
 public static boolean palindrom(String name){
    
    String convert=name.toLowerCase();
    int n=convert.length();
    int left=0;
    int right=n-1;
    
      while(left<right){
        if(convert.charAt(left)==convert.charAt(right)){
           return true;
        }
      left++;
      right--;

      }
      return false;
 }  
 public static void main(String args[]){
    boolean ans=palindrom("MooNOOm");
    System.out.println("Is it palindrom? ");
    System.out.println(ans);
 } 
}
