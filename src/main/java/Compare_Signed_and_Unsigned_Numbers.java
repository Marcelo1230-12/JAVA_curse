
import java.util.Scanner;

public class Compare_Signed_and_Unsigned_Numbers {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number#1: ");
            x =  sc.nextInt();
            System.out.println("Enter a number#2: ");
            y =  sc.nextInt();
int unsing  = Integer.compareUnsigned(x,y);
int sing = Integer.compare(x,y);
     if(sing <0){
         System.out.println("Signed number x is less than y");
     }
     else if(sing == 0){
         System.out.println("Signed number x is equal to y");
     }
        if(unsing <0){
            System.out.println("UnSigned number x is less than y");
        }
        else if(unsing == 0){
            System.out.println("UnSigned number x is equal to y");
        }
     else{ System.out.println("Signed number x is large to y");}
                sc.close();
    }
}

