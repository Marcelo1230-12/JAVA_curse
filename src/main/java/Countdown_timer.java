import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown_timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        int counter;
        System.out.println("Enter the long of the timer");
        counter = sc.nextInt();
        TimerTask task = new TimerTask() {
                int c=counter;
            @Override
            public void run() {
                System.out.println(c);
                c--;
                if(c<0){
                    System.out.println("Happy New Year");
                    timer.cancel();
                }

            }
        };
        timer.scheduleAtFixedRate(task,1000,1000);
   sc.close();
    }

}
