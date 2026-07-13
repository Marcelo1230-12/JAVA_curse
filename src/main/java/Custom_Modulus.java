import java.util.Scanner;

public class Custom_Modulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2;
        System.out.print("Enter the first number:");
        number1 = sc.nextInt();
        System.out.print("Enter the second number:");
        number2 = sc.nextInt();
        int remainder = number1 -(number2*(number1/number2));

        System.out.println("The modulus is "+ remainder);

        sc.close();

    }
}
