//find the all possible combination to make requirement
// eg: coins avalable[1,2,3] requirment=5

public class coinChangeProblem{
    public static int mincoins(int n,int coins[]){
        int subAns=0;
        int ans=Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }

       for(int i=0;i<coins.length;i++){
        if(n-coins[i]>0){
            subAns=mincoins(n-coins[i], coins);
            if(subAns!=ans && subAns+1<ans+1){
                ans=subAns+1;
             }
        }

        
       }
       return ans;
    }
    public static void main(String args[]){
       int coins[]={7,5,1};
        int n=18;
        int ans=mincoins(n, coins);
        System.out.println(ans);
    }
}