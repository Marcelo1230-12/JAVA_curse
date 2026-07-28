import java.util.Scanner;

public class Sum_Digits_to_Single_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter 2 more digit number:");
        num = sc.nextInt();
if(num>=1000) {// separate 4 digits numbers
    int number1 = num / 1000;
    int number2 = num % 1000;
    int total3= number1 + number2;
    System.out.println("the total of 2 digits is "+total3);

}
else if(num>=100){//separate  3 digits numbers
    int number3 = num / 100;
    int number4 = num % 100;
    int total2= number3+number4;
    System.out.println("the total of 3 digits is "+total2);

}
else if(num>=10){// separate 2 digits numbers
    int number5 = num / 10;
    int number6 = num % 10;
    int total = number5+number6;
    System.out.println("the total of 2 digits is "+total);
}

        sc.close();
    }
}
