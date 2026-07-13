import java.util.Scanner;

public class Count_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 ;
        int space = 0;
        int numers=0;
        int letters=0;
        int others=0;
        System.out.println("Enter the string");
        str1 = sc.nextLine();
       for (int i=0;i<str1.length();i++){
           if(str1.charAt(i)==' '){
               space++;
           }
          else if((str1.charAt(i)>='0')&&(str1.charAt(i)<='9')){
               numers++;
           }
          else if((str1.charAt(i)>='a')&&(str1.charAt(i)<='z')
           ||(str1.charAt(i)>='A')&&(str1.charAt(i)<='Z')){
               letters++;
           }else {
               others++;
           }

       }
        System.out.println("letter = "+letters);
       System.out.println("numer = "+numers);
       System.out.println("other = "+others);
       System.out.println("space = "+space);
        sc.close();
    }
}
