import java.util.Scanner;

public class Check_if_Sum_of_Two_Integers_is_Greater_than_Third {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
long n1 ,n2,n3;
        System.out.print("enter input1:");
        n1 = sc.nextInt();
        System.out.print("enter input2:");
        n2 = sc.nextInt();
        System.out.print("enter input3:");
        n3 = sc.nextInt();
        if((n1+n2)>n3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        sc.close();
    }
}
