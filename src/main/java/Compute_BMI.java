import java.util.Scanner;

public class Compute_BMI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pounds;
        int inches;
        double BMI;
        System.out.println("Enter the weight in pounds: ");
        pounds = sc.nextInt();
        System.out.println("Enter the height in inches: ");
        inches = sc.nextInt();
        BMI = (pounds*703)/(inches*inches);
        System.out.println("The Body Max Index is "+ BMI);
        sc.close();
    }
}
