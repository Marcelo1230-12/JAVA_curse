import java.util.Scanner;

public class Break_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int number;
String[] hold = new String[6];
        System.out.println("Enter a number: ");
        number = sc.nextInt();
      for(int i=0;i<6;i++){
        if(number!=0){
          hold[i]=String.valueOf(number%10);
          number = number/10;
        }
      }
for(int i = 5 ; i>=0 ; i--){
if(hold[i]!=null){
System.out.print(hold[i]+" ");
}
}
        sc.close();
    }
}
