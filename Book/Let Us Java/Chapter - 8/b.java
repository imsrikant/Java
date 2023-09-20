/**
 * b
 */
public class b {
    public static void main(String[] args) {
        System.out.println("Minimum: " + min(1, 2, 3, 45, 57, 0, -99));
    }

    static int min(int... number) {
        int min = 0;
        for (int i : number) {
            min = min < i ? min : i;
        }
        return min;
    }

}
