import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number3,number4;
        System.out.print("Enter the first number");
        number1 = sc.nextInt();
        System.out.print("Enter the second number");
        number3 = sc.nextInt();
        number4 = Math.abs(number1*number3);
        System.out.print("The Produc is "+ number4);
        sc.close();
    }
}
