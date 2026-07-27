import java.util.Scanner;

public class Test_Substring_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1,n2;
        System.out.println("Enter the first string");
        n1= sc.nextLine();
        System.out.println("Enter the second string");
        n2= sc.nextLine();
        if(n2.contains(n1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        sc.close();
    }
}
