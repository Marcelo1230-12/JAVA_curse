import java.util.Scanner;

public class Test_Double_0_and_1_Between {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double numer1,numer2;
    System.out.println("enter the first number");
    numer1=sc.nextDouble();
    System.out.println("enter the second number");
    numer2=sc.nextDouble();
    if(numer1>0&& numer2<1){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    sc.close();
}
}
