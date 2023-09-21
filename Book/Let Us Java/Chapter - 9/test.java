
import java.util.Scanner;


/**
 * The Rectangle class represents a rectangle and provides methods to set its dimensions, display its
 * dimensions, and calculate its area and perimeter.
 */
class Rectangle {
    private float length, breadth;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length for rectangle: ");
        length = scanner.nextFloat();
        System.out.print("Enter breadth for rectangle: ");
        breadth = scanner.nextFloat();
        scanner.close();
    }

    public void setData(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayData() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public void areaPeri() {
        float area, prei;
        area = length * breadth;
        prei = 2 * (length + breadth);
        System.out.println("Area: " + area);
        System.out.println("Peri: " + prei);
    }
}


public class test {
   public static void main(String[] args) {
     Rectangle r1, r2, r3;
    r1=new Rectangle();
    r2=new Rectangle();
    r3=new Rectangle();

    r1.setData(10,20);
    r1.displayData();
    r1.areaPeri();

    r2.setData(54.54f,54.48f);
    r2.displayData();
    r2.areaPeri();

    r3.getData();
    r2.displayData();
    r2.areaPeri();
   }
}
