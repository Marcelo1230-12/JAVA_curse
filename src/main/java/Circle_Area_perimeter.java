import java.util.Scanner;

public class Circle_Area_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        double radio ;
        System.out.println("Enter the radio:");
        radio = sc.nextDouble();
        double perimeter = 2*pi*radio;
        double area = pi*Math.pow(radio,2);
        System.out.println("Area is "+ area);
        System.out.println("Perimeter is "+ perimeter);
sc.close();
    }
}
