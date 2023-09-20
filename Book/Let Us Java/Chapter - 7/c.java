/**
 * c
 */

import java.util.Scanner;
public class c {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        boolean isTrue = isLeap(year);
        if (isTrue) {
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }
        sc.close();
    }

    public static boolean isLeap(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        return isLeap;
    }

}
