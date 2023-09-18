// to check the triangle is valid or not using its sides

import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        float sideA, sideB, sideC;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of triangle: ");
        sideA = sc.nextFloat();
        System.out.print("Enter the second side of triangle: ");
        sideB = sc.nextFloat();
        System.out.print("Enter the third side of triangle: ");
        sideC = sc.nextFloat();
        if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideC + sideA) > sideB) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }
        sc.close();
    }
}
