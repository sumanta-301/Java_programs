package prime;

public class ReverseofaNumber {
    public static void main(String[] args){
        int b = 561;
        int temp = 0;
        int reverse = 0;
        while(b!=0){
            int remainder=(b %10);
            //System.out.println(remainder);
             reverse= reverse*10+remainder;
                b=b/10;
                //System.out.println(b);

        }
        System.out.println("Reverse of the number is:"+reverse);
    }

}
