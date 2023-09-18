// rectangle area is greater than its perimeter

import java.util.Scanner;
public class h {
    public static void main(String[] args) {
        float length, breadth, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth of rectangle: ");
        breadth = sc.nextFloat();
        area = length * breadth;
        perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Area is not greater than perimeter");
        }
        sc.close();
    }
}
