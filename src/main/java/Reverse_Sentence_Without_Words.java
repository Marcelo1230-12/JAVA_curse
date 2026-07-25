import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Sentence_Without_Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence=sc.nextLine();
        String []str=sentence.split("\\s+");
        char []arr=sentence.toCharArray();
        for(int j = str.length-1; j>=0; j--){
            System.out.print(str[j]+" ");
        }
        sc.close();
    }
}
