package recursion;
import java.util.Scanner; 
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Foctoril of "+n+" is "+fact);
    }
    public static int factorial(int n){
        if(n>1){
            return n*factorial(n-1);
        }else{
            return 1;
        }
    }
}
