import java.util.Scanner;

public class Square_Root_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number:");
        number = sc.nextInt();
        int root = (int)Math.sqrt(number);
        System.out.println("The square root of "+number+" is "+root);

        sc.close();
    }
}
