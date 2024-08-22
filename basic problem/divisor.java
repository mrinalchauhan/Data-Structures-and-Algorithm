public class divisor {
    public static void divisorN(){
        int num=36;
        System.out.println("all divisor of the number is");
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }

        }
    }
    public static void main(String args[]){
        divisorN();
    }
}
