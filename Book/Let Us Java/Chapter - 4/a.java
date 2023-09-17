// input cost of item and selling price of item and find profit or loss
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        float cost, selling, profitPercentage, lossPercentage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of item: ");
        cost = sc.nextFloat();
        System.out.print("Enter selling price of item: ");
        selling = sc.nextFloat();
        if (selling > cost) {
            profitPercentage = ((selling - cost) / cost) * 100;
            System.out.println("Profit: " + profitPercentage + "%");
        }
        else {
            lossPercentage = ((cost - selling) / cost) * 100;
            System.out.println("Loss: " + lossPercentage + "%");
        }
        sc.close();
    }
}
