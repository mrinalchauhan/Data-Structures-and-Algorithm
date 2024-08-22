// print saomething N times without using loop and return list of string 
// coding ninja ques
//T.C=O(N)  => recursilvely n times 
//S.C=O(N)

import java.util.*;
public class RECstringNtimes {
    public static List<String> printrec(int n){
        List<String>str=new ArrayList<>();
         noloop(str,n);
         return str;

    }
    public static void noloop(List<String>str1,int i){
        if(i==0){
            return;
        }
        str1.add("something");
        noloop(str1,i-1);

    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number :");
     int n=sc.nextInt();
     List<String> ans=printrec(n);
     for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
     }
     

    }
    
}
