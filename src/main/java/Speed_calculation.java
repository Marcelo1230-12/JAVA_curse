import java.util.Scanner;

public class Speed_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meters;
        int hours;
        int mimutes;
        int seconds;
        double total;
        double ms;
        double kh;
        double mh;
        System.out.println("Distance in Meters:");
        meters = sc.nextInt();
        System.out.println("hours:");
        hours = sc.nextInt();
        System.out.println("mimutes:");
        mimutes = sc.nextInt();
        System.out.println("seconds:");
        seconds = sc.nextInt();
        total = (hours*3600)+(mimutes*60)+seconds;
        double totalh = total/3600.0;
        ms = (double)meters/total;
        kh = (meters/1000.0)/totalh;
        mh = (meters/1609.344)/totalh;
        System.out.println("Your speed in m/s is "+ ms);
        System.out.println("Your speed in k/h is "+ kh);
        System.out.println("Your speed in m/h is "+ mh);

    sc.close();
    }

}
