import java.util.Scanner;

public class MyAtm {
    public static void main(String[] args) {
        double balance = 1000;
        String hiMessage = "Hi, i'm ATM!\nPlease enter your value";
        String balanceMessage = "Now your balance is ";
        String incorrectMessage = "Incorrect";
        String finishMessage = "Program finished\nBye(:";
        System.out.println(hiMessage);
        Scanner myScan = new Scanner(System.in);
        double myCash = myScan.nextDouble();
        if(myCash > 0 && myCash <= 1000) {
            balance -= myCash;
            System.out.println(balanceMessage + balance);
        }else if(myCash < 0) {
            System.out.println(incorrectMessage);
        }else if(myCash > 1000) {
            System.out.println("You don't have enough money on balance");
        }else System.out.println("Your balance is still the same");
        System.out.println(finishMessage);
        }




    }

