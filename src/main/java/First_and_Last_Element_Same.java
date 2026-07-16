import java.util.Scanner;

public class First_and_Last_Element_Same {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);
        int number ;
        System.out.print("Enter the long of list:");
        number = sc.nextInt();
            System.out.println("Enter the elemtes:");
            int []a = new int [number];
        for (int i = 0; i < number; i++) {
        a[i] = sc.nextInt();
        }

        for  (int i = 0; i < number; i++) {
            if(a[i]==a[number-1]) {
                System.out.println("true");
break;
            }
            else {
                System.out.println("false");
            break;
            }

        }

        sc.close();
    }
}
