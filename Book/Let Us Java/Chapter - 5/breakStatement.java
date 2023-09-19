import java.util.Scanner;
public class breakStatement {
    public static void main(String[] args) {
        int num, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        i = 2;
        while (i <= num - 1) {
            if (num % i == 0) {
                System.out.println("Not a prime number");
                break;
            }
            i++;
        }
        if (i == num)
            System.out.println("Prime number");

        sc.close();
    }
}
