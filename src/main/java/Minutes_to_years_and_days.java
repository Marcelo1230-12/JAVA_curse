import java.util.Scanner;

public class Minutes_to_years_and_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutes;
        int years=0;
        int days=0;
        System.out.println("Enter the minutes: ");
        minutes = sc.nextInt();

    years = minutes/525600;
    days = (minutes%525600)/1440;

        System.out.println(minutes + " minutes  is approxinately "+years+" years and "+days+" days ");
        sc.close();
    }
}
