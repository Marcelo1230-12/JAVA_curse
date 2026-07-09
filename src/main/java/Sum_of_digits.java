import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int total=0;
        System.out.println("Enter a number between 0 and 1000: ");
        number = sc.nextInt();
        while(number!=0){
            total+=number%10;
            number=number/10;
        }
        System.out.println("The sum of the digits in "+ number + " is "+total);

        sc.close();
    }
}
