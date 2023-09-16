// minimum number of currency notes of each denomination to give to the withdrawer
import java.util.Scanner;
public class e {
    public static void main(String[] args) {
        final int notes_10 = 10, notes_50 = 50, notes_100 = 100;
        float currency;
        int tenToGive, fiftyToGive, hundredToGive;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        currency = sc.nextFloat();
        hundredToGive = (int) (currency / notes_100);
        currency %= notes_100;
        fiftyToGive = (int) (currency / notes_50);
        currency %= notes_50;
        tenToGive = (int) (currency / notes_10);
        currency %= notes_10;
        System.out.println("100 : " + hundredToGive + " 50: " + fiftyToGive + " 10: " + tenToGive);
        sc.close();
    }
}
