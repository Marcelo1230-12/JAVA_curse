import java.util.Arrays;
import java.util.Scanner;

public class Find_K_Largest_Elements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the List:");
        int n = sc.nextInt();
        System.out.print("how many largest elements: ");
        int m = sc.nextInt();
        int []list  = new int[n];
        System.out.println("Enter the elements of the List:");
        for (int i =0 ; i< n;i++){
            list[i]= sc.nextInt();
        }
        Arrays.sort(list);
        for  (int i = 0; i < list.length ; i++){
           if(list[i]>=list[list.length-m]){// the subtraction by m is the numbers of elemtens to checks
               System.out.println(list[i]);
           }
        }
        sc.close();
    }
}
