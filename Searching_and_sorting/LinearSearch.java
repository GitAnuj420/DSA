package Searching_and_sorting;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr= {5,3,66,8,3,45,90,100};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int value = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value)
            {
                System.out.println("value present at "+i);
                break;
            }
        }
    }
}
