import java.util.Scanner;

public class arimethic_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,add,sub,product,distance,max,min;
        double average;
        System.out.println("Enter 1st number");
        x = sc.nextDouble();
        System.out.println("Enter 2nd number");
        y = sc.nextDouble();
        add= x+y;
        sub=x-y;
        product = x*y;
        average = (x+y)/2;
        max = x>y?x:y;
        min = x<y?x:y;
        distance =Math.abs(x-y);
        System.out.println("Addition is: "+add);
        System.out.println("Subtraction is: "+sub);
        System.out.println("Product is: "+product);
        System.out.println("Distance is: "+distance);
        System.out.println("Maximum is: "+max);
        System.out.println("Minimum is: "+min);
        System.out.println("Average is: "+average);
        sc.close();
    }
}
