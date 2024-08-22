 class reverse {
    public static void reversed(){
        int num=654;
        int n=num;
        int s=0;
        while(n>0){
            int r=n%10;
            s=s*10+r;
            n=n/10;

        }
        System.out.println("reverse of the number "+s);
    }

    public static void main(String args[]){
         reversed();
      
    }
}
