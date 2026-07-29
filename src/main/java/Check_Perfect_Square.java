import java.util.Scanner;

public class Check_Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
if((sqrt *sqrt)==n){
    System.out.println("true");
}
else{
    System.out.println("false");
}

    }
}
