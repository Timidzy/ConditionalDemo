import java.util.Scanner;

public class ShopManDemo {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = myScan.nextInt();

        if(hour >= 8 && hour < 18){
            System.out.println("Go to work");
        }else if(hour >= 18 && hour < 23){
            System.out.println("Go home or go to shop");
        }else if(hour >= 23 && hour <= 24) {
            System.out.println("All shops are closed");
        }else if(hour >= 0 && hour < 8){
            System.out.println("All shops are closed");
        }else System.out.println("Error !");
    }
}
