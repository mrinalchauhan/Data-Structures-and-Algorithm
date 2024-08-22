/* class count{
    public static void main (String args[]){
        int num=6321;
        int n=num;
        int c=0;
        while(num>0){
            n=n%10;
            c++;
            num=num/10;
        }
        System.out.println("counting the number of digits "+c);
    }
}  */


// another
 /* class count{
    public  void countDigit(){
        int num=325;
        int n=num;
        int c=0;
        while(num>0){
            n=n%10;
            c++;
            num=num/10;
        }
        System.out.println("counting the number of digits "+c);
    }
    public static void main(String args[])
{     count cc=new count();         // way of calling non static function
        cc.countDigit();
}
}          */

   // another way
/*    class count{
    public static void counttDigits(){    //  static reference eg also
        int num=654;
        String str=Integer.toString(num);
        int strl=str.length();
        System.out.println("count the number of digits of a interger by convertiong it to string "+strl);
    }
    public static void main(String args[]){
           counttDigits();           //  way of calling static function
    }
    
}   */


// another way
class count{
    public static void counttDigits(){    //  static reference eg also
        int num=654;
         int n=(int)Math.floor(Math.log10(num)+1);
         System.out.println(" count no of digits by taking log of that number then adding 1 to the integral part  " + n);
    }
    public static void main(String args[]){
           counttDigits();           //  way of calling static function
    }
}