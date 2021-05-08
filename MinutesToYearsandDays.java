package minutestoyearsanddays;
import java.util.*;
public class MinutesToYearsandDays {

    public static void main(String[] args) {
        int minutesInYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int min = input.nextInt();
        int years = (int) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
}
