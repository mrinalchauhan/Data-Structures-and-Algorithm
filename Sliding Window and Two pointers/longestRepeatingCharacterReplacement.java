public class longestRepeatingCharacterReplacement {

    public static int function(String s,int k) {
        int start=0;
        int maxfreq=0;
        int maxsize=0;
        int count[]=new int[26];
    for(int end=0;end<s.length();end++){
        char ch=s.charAt(end);
        count[ch-'A']++;
        maxfreq=Math.max(maxfreq,count[ch-'A']);

        if((end-start+1)-maxfreq>k){
            char ch1=s.charAt(start);
            count[ch1-'A']--;
            start++;
          
        }
        if ( (end - start + 1) - maxfreq <= k) {  
         maxsize = Math.max(maxsize, end - start + 1);
        }
      
    }
    return maxsize;
}
    public static void main(String args[]){
      String s="AABABBA";
      int k=1;
      int ans=function(s,k);
      System.out.println(ans);

    }
}
