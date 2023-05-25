package prime;

public class PrimeorNot {
    public static void main(String[] args){
        int n= 14;
        int i=0;
        boolean flag=false;
        int m=0;
        m = n/2;
        if(n==0 ||n==1){
            System.out.println(n+ " Number is not prime");
        } else{
            for(i=2; i<=m; i++){
                if(n%i==0){
                    System.out.println(n +" is not prime number");
                    flag =true;
                    break;
                }
            }
        }
        if(flag==false){
            System.out.println(n+"Number is a prime number");
        }
    }

   }

