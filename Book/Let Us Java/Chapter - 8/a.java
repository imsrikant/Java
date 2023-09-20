/**
 * a
 */

import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        int intA = 5, intB = 54, intMax;
        double doubleA = 5.9999644, doubleB = 5.54455654, doubleMax;
        float floatA = 5.46545f, floatB = 5.4654f, floatMax;
        intMax = max(intA, intB);
        floatMax = max(floatA, floatB);
        doubleMax = max(doubleA, doubleB);
        System.out.println("Max int " + intMax);
        System.out.println("Max float " + floatMax);
        System.out.println("Max double " + doubleMax);
    }

    static int max(int intA, int intB) {
        return intA > intB ? intA : intB;
    }

    static float max(float floatA, float floatB) {
        return floatA > floatB ? floatA : floatB;
    }

    static double max(double doubleA, double doubleB) {
        return doubleA > doubleB ? doubleA : doubleB;
    }
}
