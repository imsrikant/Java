/**
 * d
 */
import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        float num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float and integer: ");
        num1 = sc.nextFloat();
        num2 = sc.nextInt();
        float value = product(num1, num2);
        System.out.println("Value: " + value);
        sc.close();
    }

    public static float product(float num1, int num2) {
        return num1 * num2;
    }

}
