package recursion;
import java.util.*; 
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double num = sc.nextInt();
        double n =sc.nextInt();
        double ans = power(num,n);
        System.out.println(ans);
    }

    public static double power(Double num,Double n){
        if(n>0){
            return num*power(num,n-1);
        }else{
            return 1;
        }
    }
}
