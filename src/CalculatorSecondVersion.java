import java.util.Scanner;

public class CalculatorSecondVersion {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = myScan.nextInt();
        System.out.println("Enter your second number");
        int secondNum = myScan.nextInt();
        int result = 0;

        System.out.println("Choose operation: ");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multi");
        System.out.println("4 - div");
        int operation = myScan.nextInt();
        switch (operation){
            case 1:
                result = firstNum + secondNum;
                break;
            case 2:
                result = firstNum - secondNum;
                break;
            case 3:
                result = firstNum * secondNum;
                break;
            case 4:
                result = firstNum / secondNum;
                break;
            default:
                System.out.println("Error !");
        }
        System.out.println("result = " + result);

    }
}
