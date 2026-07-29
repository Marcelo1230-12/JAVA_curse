import java.util.Scanner;
public class Check_If_Sides_Form_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int sz1,sz2,sz3;
        System.out.print("Enter the first sides:");
        sz1 = sc.nextInt();
        System.out.print("Enter the second sides:");
        sz2 = sc.nextInt();
        System.out.print("Enter the third sides:");
        sz3 = sc.nextInt();
        int a = sz1*sz1;
        int b = sz2*sz2;
        int c = sz3*sz3;

        if((a+b)==c){
            System.out.println("The triangle is right");
        }
        else{
            System.out.println("The triangle is not right");
        }
        sc.close();
    }

}
