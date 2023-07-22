import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Manoj {
    static final int fMin = 32, fMax = 212, cMin = 0, cMax = 100;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("manoj.dat"));
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            int mMin = in.nextInt();
            int mMax = in.nextInt();
            int convert = in.nextInt();

            String from = in.next();
            String to = in.next();

            if (from.equals("C") && to.equals("F")) {
                System.out.printf("%d degrees C = %d degrees F%n", convert, (int) (9./5 * convert + 32));
                continue;
            } else if (from.equals("F") && to.equals("C")) {
                System.out.printf("%d degrees F = %d degrees C%n", convert, (int) ((5 * (convert - 32)) / 9.));
                continue;
            }

            double ratio = 1;
            int right = 1, left = 1;

            if (from.equals("C")) {
                ratio = findRatio(mMax - mMin, cMax - cMin);
                right = cMin; left = mMin;
            } else if (from.equals("F")) {
                ratio = findRatio(mMax - mMin, fMax - fMin);
                right = mMin; left = fMin;
            } else if (to.equals("C")) {
                ratio = findRatio(cMax - cMin, mMax - mMin);
                right = mMin; left = cMin;
            } else if (to.equals("F")) {
                ratio = findRatio(fMax - fMin, mMax - mMin);
                right = fMin; left = mMin;
            }


            int convertedTemp = (int) (ratio * (convert - findX(ratio, right, left)));
            System.out.printf("%d degrees %s = %d degrees %s%n", convert, from, convertedTemp, to);
        }
    }

    public static double findRatio(int a, int b) {
        return (double) a / b;
    }

    public static double findX(double ratio, double right, double left) {
        right *= (1/ratio);
        right += left < 0 ? left : -left;
        return -right;
    }
}
