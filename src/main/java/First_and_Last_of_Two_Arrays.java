import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class First_and_Last_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter the long of the first list:");
        number1 = sc.nextInt();
        System.out.print("Enter the long of the second list:");
        number2 = sc.nextInt();
        int [] list = new int[number1];
        int [] list2 = new int[number2];
        System.out.println("Enter the elements of the first list:");
        for (int i= 0; i<number1;i++){
            list[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the elements of the second list:");
        for (int i= 0; i<number2;i++){
            list2[i] = sc.nextInt();
        }
               Arrays.sort(list);
        Arrays.sort(list2);
        System.out.println(Arrays.equals(list2, list));
        sc.close();
    }
}
