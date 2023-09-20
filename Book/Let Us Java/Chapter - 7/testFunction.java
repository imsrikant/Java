/**
 * testFunction
 */
public class testFunction {

    public static void main(String[] args) {
        int num = 3;
        System.out.println(checkOdd(num));
    }

    public static String checkOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
