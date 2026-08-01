import java.util.Scanner;

public class Find_Smallest_Number_Among_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        System.out.println(small_number(a,b,c));
        sc.close();
    }
     static  int small_number1(int z,int c){
        if(z<c){
            return z;
        }
        else {
            return c;
        }

    }
    static int small_number( int x, int y, int g){
        if(small_number1(x,y)<g){
            return small_number1(x,y);
        }
        else{
            return g;
        }

    }
}
