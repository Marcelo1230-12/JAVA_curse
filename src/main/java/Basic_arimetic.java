import java.util.Scanner;

public class Basic_arimetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1,number2,add,sub,pro,divi,mod;
        System.out.println("Enter the first number");
        number1 = sc.nextInt();
        System.out.println("Enter the second number");
        number2 = sc.nextInt();
        add = number1+number2;
        sub = number1-number2;
        pro = number1*number2;
        divi = number1/number2;
        mod = number1%number2;
        System.out.println(number1+"+"+number2+"="+add);
        System.out.println(number1+"-"+number2+"="+sub);
        System.out.println(number1+"*"+number2+"="+pro);
        System.out.println(number1+"/"+number2+"="+divi);
        System.out.println(number1+"mod"+number2+"="+mod);
        sc.close();
    }
}
