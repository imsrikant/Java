public class e {
    public static void main(String[] args) {
        float pi = 3.14f;
        float length = 5f, breadth = 10f;
        float radius = 5f;
        float areaOfRectangle = length * breadth;
        float perimeterOfRectangle = 2 * (length + breadth);
        float areaOfCircle = pi * radius * radius;
        float circumferenceOfCircle = 2 * pi * radius;
        System.out.println("Area of Rectangle: " + areaOfRectangle);
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
        System.out.println("Area of Circle: " + areaOfCircle);
        System.out.println("Circumference of Circle: " + circumferenceOfCircle);
    }
}
