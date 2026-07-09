import java.util.Scanner;

public class Compute_Floor_Division_and_odulus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double dividendo;
       double divisor;
       double result;
        System.out.print("Enter the Dividend :" );
        dividendo = sc.nextDouble();
        System.out.print("Enter the Divisor :" );
        divisor = sc.nextDouble();
        result = Math.floor(dividendo/divisor);
        double modu = dividendo-(result*divisor);
        System.out.print((int)result + " is the floor division.");
        System.out.print((int)modu + " is the floor division.");

        sc.close();
    }
}
