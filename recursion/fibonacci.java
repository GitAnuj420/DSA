package recursion;
import java.util.*;
public class fibonacci {
    static int n1=0,n2=1,n3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(n1+" "+n2+" ");
    fibonacci(num-2);
    }

    public static void fibonacci(int num){
           while(num>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            num--;
           }
    } 
}
