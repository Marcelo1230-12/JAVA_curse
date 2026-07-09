import java.util.Scanner;

public class Compute_square_cube_forth_power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.println("Enter the number");
        number = sc.nextInt();
        double power2= Math.pow(number,2);
        double power3= Math.pow(number,3);
        double power4= Math.pow(number,4);
        System.out.println("Square is "+power2);
        System.out.println("Cube is "+power3);
        System.out.println("Forth is "+power4);
        sc.close();
    }
}
