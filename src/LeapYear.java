import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Hi!\nEnter a year");
        int year = myScan.nextInt();
        if (year % 4 == 0){
            System.out.println("This year is leap");
        }else System.out.println("This year isn't leap");
        System.out.println("See u next time)");
    }
}
