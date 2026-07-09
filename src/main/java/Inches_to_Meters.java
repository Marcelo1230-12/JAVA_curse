import java.util.Scanner;

public class Inches_to_Meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches;
        double meters;
        System.out.println("Enter the number of inches: ");
        inches = sc.nextDouble();
        meters = inches * 0.0254;
        System.out.println(inches + " inch is "+ meters+ " meters");
        sc.close();
    }
}
