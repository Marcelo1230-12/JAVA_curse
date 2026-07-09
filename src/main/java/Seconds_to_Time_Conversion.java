import java.util.Scanner;

public class Seconds_to_Time_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds, minutes, hours;
        System.out.println("Enter the time in seconds: ");
        seconds = sc.nextInt();
        if(seconds==0){
            System.out.println("not 0 seconds");
        }
        minutes = seconds/60;
        seconds = seconds%60;
        hours = minutes/60;
        minutes = minutes%60;
        System.out.println(hours+":"+minutes+":"+seconds);
        sc.close();
    }
}
