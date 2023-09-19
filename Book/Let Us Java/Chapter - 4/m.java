// character entered is character, symbol or digit

import java.util.Scanner;

public class m {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = sc.nextLine().charAt(0);
         if (ch >= 97 && ch <= 123) {
            System.out.println("Character is lowercase");
        }
        else if (ch >= 48 && ch <= 57) {
            System.out.println("Character is digit");
        }
        else {
            System.out.println("Character is symbol");
        }
        sc.close();
    }
}
