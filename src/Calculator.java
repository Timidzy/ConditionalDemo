import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello !");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Your number is positive");
        }else if (num < 0){
                System.out.println("Your number is negative");
            }else {
            System.out.println("Your number is zero");
        }
        if (num % 2 == 0){
            System.out.println("Your number is even");
        }else System.out.println("Your number is odd");



    }
}
