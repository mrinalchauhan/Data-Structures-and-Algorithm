/*  Number of substrings containing all three characters

Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.
 */
public class NumberOfSubstringContainingAllThreeCharacters {
    public static int function(String s){
        int start=0;
        int acount=0,bcount=0,ccount=0;
        int res=0;
        for(int end=0;end<s.length();end++){
            char ch1=s.charAt(end);
            if(ch1=='a'){
                acount++;
            }
            if(ch1=='b'){
                bcount++;
            }
            if(ch1=='c'){
                ccount++;
            }
            while(acount>0 && bcount>0 && ccount>0){
                res=res+(s.length()-end);
                 
                char ch2=s.charAt(start);
                if(ch2=='a'){
                    acount--;
                }
                if(ch2=='b'){
                    bcount--;
                }
                if(ch2=='c'){
                    ccount--;
                }
                start++;
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s="aaacb";
        int res=function(s);
        System.out.println("number of substring containing all three characters of given string is "+res);
    }
}
