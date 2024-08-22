
// Given a string s, find the length of the longest substring without repeating characters.
import java.util.*;
public class longestSubstringWithoutRepeatCharacter {
    public static int function(String s){
       HashSet<Character> hash=new HashSet<>();
       int start=0;
       int maxlen=0;
       for(int end=0;end<s.length();end++){
        char ch=s.charAt(end);
        if(hash.contains(ch)){
            hash.remove(ch);
            start++;
        }
        hash.add(ch);
        maxlen=Math.max(end-start+1,maxlen);
       }
       return maxlen;
    }
    public static void main(String args[]){
        String s="abcabcbb";
        int ans=function(s);
        System.out.println("longest substring without repeating charcter of "+s+ "has length= " +ans );
    }
}