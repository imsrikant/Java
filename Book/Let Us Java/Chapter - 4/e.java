// check the triangle is valid or not
import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        a = sc.nextFloat();
        System.out.print("Enter the second side of triangle: ");
        b = sc.nextFloat();
        System.out.print("Enter the third side of triangle: ");
        c = sc.nextFloat();
        if ((a + b + c) == 180) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }
        sc.close();
    }
}
