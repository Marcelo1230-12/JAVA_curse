import java.util.Scanner;

public class Convert_F_to_C {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
double Fahrenheit;
double Celsius;
    System.out.println("Enter the Degree in Fahrenheit: ");
    Fahrenheit = sc.nextDouble();
    Celsius = (Fahrenheit - 32) * 5 / 9;
    System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + Celsius + "in Celsius");
sc.close();
}
}
