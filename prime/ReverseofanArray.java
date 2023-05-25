package prime;

public class ReverseofanArray {
    public static void main(String[] args){
        int name[] = {3,5,7,4,11};
        for(int i=0; i<name.length; i++){

            System.out.println(name[i]);
        }
        for(int i=name.length-1;i>=0;i--){
            System.out.println(name[i]);
        }
    }
}
