import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hi!\nEnter a year");
        int year = myScan.nextInt();
        if (year % 100 == 0 && year % 400 == 0 && year % 4 == 0) {
            System.out.println("This year is leap");
        } else if (year % 400 != 0 && year % 100 == 0) {
            System.out.println("This year isn't leap");
        } else if (year % 4 == 0){
            System.out.println("This year is leap");
        }
        System.out.println("Program was ended");

    }
}
