import java.util.Scanner;

public class Check_Finite_Floating_Point_Value {
public  static void main(String args[]){
Scanner sc=new Scanner(System.in);
float number;
    System.out.println("Enter a number: ");
    number=sc.nextFloat();
    if(!Float.isFinite(number)) System.out.println("Invalid input");
    else System.out.println("Is valid");

sc.close();
}
}
