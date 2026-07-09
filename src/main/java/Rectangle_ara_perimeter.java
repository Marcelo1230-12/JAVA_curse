import java.util.Scanner;

public class Rectangle_ara_perimeter {
    public static void main(String[] args) {
        double width,height;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter width:");
        width=sc.nextDouble();
        System.out.print("Enter height:");
        height=sc.nextDouble();
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println("Area is "+ area);
        System.out.println("Perimeter is "+ perimeter);
        sc.close();
    }
}
