import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Enter the first number");
        number1 = sc.nextInt();
        System.out.println("Enter the second number");
        number2 = sc.nextInt();
        number3 = Math.abs(number1/number2);
        System.out.println("The Division is "+number3);
        sc.close();
    }
}
