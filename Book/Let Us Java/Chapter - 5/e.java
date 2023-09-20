// all combinations of 1,2,3

public class d {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print(i + "" + j + "" + k + "\n");
                }
            }
        }
    }
}
