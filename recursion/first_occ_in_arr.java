package recursion;
import java.util.*;
public class first_occ_in_arr {
    static int i =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr ={5,4,6,3,6,8};
        int v = 6;
        int s = arr.length;
        printArr(arr,s,i,v);

   }
   public static void printArr(int[]arr,int s,int i,int v){
        if(i<s)
        {
            if(arr[i]==v){
                System.out.println("Occure at :"+i);
                i=s;
            }

        }else{
            return;
        }
        printArr(arr,s,++i,v);
   }
}
