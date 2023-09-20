// menu based program
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        int choice, number, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Factorial of a number");
        System.out.println("2. Prime or not");
        System.out.println("3. Odd or even");
        System.out.println("4. Exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number: ");
                number = sc.nextInt();
                for (int i = 1; i <= number; i++) {
                    fact *= i;
                }
                System.out.println("Factorial: " + fact);
                break;

            case 2:
                int flag = 0;
                System.out.println("Enter the number: ");
                number = sc.nextInt();
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        flag++;
                    }
                }
                if (flag == 2) {
                    System.out.println("Prime");
                    break;
                } else {
                    System.out.println("Not Prime");
                    break;
                }

            case 3:
                System.out.println("Enter the number: ");
                number = sc.nextInt();
                String answer = number % 2 == 0 ? "Even" : "Odd";
                System.out.println("Number is " + answer);
                
            default:
                break;
        }
        sc.close();
    }
}
