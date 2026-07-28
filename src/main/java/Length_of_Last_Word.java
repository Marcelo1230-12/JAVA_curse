import java.util.Scanner;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine();
       int count = 0;

     for(int i = str.length()-1; i>0;i--){
if(str.charAt(i)==' '){
    break;
}
else {
    count++;
}
     }
        System.out.println("The last word is: "+count);
        sc.close();
    }
}
