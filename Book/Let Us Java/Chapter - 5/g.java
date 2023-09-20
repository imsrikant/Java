//  print the table
import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for table: ");
        number = sc.nextInt();
        for (int i = 1;  i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}
