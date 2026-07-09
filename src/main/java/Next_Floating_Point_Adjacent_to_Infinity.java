import java.util.Scanner;

public class Next_Floating_Point_Adjacent_to_Infinity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double number ;

        System.out.println("Enter the number");
        number = sc.nextDouble();
double up = Math.nextUp(number);
double down = Math.nextDown(number);

        System.out.println("The nextUp is " + up);
        System.out.println("The nextDown is " + down);

        sc.close();
    }
}
