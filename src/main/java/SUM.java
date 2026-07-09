import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number3;
        System.out.println("Enter the first number");
        number1 = sc.nextInt();
        System.out.println("Enter the second number");
        number3 = sc.nextInt();
        int total = number1+number3;
        System.out.println("The Sum is "+total);
        sc.close();
    }
}
