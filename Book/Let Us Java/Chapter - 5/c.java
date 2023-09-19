// prime number 1 to 300
public class c {
    public static void main(String[] args) {
        int seriesStarts = 1, seriesEnds = 300;
        for (int i = seriesStarts; i <= seriesEnds; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
