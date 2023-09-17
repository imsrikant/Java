// find the ages of the three persons
import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        int Ram, Shyam, Ajay;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        Ram = sc.nextInt();
        System.out.print("Enter the age of Shyam: ");
        Shyam = sc.nextInt();
        System.out.print("Enter the age of Ajay: ");
        Ajay = sc.nextInt();
        name = (Ram < Shyam) ? ((Ram < Ajay) ? "Ram" : "Ajay") : ((Shyam < Ajay) ? "Shyam" : "Ajay");
        System.out.println(name);
        sc.close();
    }
}
