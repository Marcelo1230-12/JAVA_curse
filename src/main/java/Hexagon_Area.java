import java.util.Scanner;

public class Hexagon_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.print("Enter the length of the hexagon: ");
        number = sc.nextDouble();
        double total = (6*Math.pow(number,2)/(4*Math.tan(Math.PI/6)));
        System.out.println("The area of the hexagon is "+total);
    }
}
