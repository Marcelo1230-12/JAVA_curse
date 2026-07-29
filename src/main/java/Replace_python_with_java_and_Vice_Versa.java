import java.util.Scanner;

public class Replace_python_with_java_and_Vice_Versa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

     String str1= str.replace("python","temp").replace("java","phyton").replace("python","java").replace("temp","java");

        System.out.println("phyton for Java");
        System.out.println(str1);

        sc.close();
    }
}
