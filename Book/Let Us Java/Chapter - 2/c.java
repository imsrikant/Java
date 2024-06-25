import java.util.Scanner;

public class c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float math, physics, chemistry, biology, computer;
        System.out.print("Enter Math Marks: ");
        math = scanner.nextFloat();
        System.out.print("Enter Physics Marks: ");
        physics = scanner.nextFloat();
        System.out.print("Enter Chemistry Marks: ");
        chemistry = scanner.nextFloat();
        System.out.print("Enter Biology Marks: ");
        biology = scanner.nextFloat();
        System.out.print("Enter Computer Marks: ");
        computer = scanner.nextFloat();
        if (math > 100 || physics > 100 || chemistry > 100 || biology > 100 || computer > 100) {
            System.out.println("Marks can't be greater than 100");
            scanner.close();
            return;
        }
        float total = math + physics + chemistry + biology + computer;
        float percentage = total / 5;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
