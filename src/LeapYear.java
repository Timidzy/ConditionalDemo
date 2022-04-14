import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String leapYear = "This year is leap";
        String notLeapYear = "This year isn't leap";
        System.out.println("Hi!\nEnter a year");
        int year = myScan.nextInt();
        if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0) {
            System.out.println(leapYear);
        } else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println(notLeapYear);
        } else if (year % 4 == 0) {
            System.out.println(leapYear);
        }
        System.out.println("Program was ended");

    }
}
