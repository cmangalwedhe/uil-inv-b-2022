import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Diana {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("diana.dat"));

        while (in.hasNextDouble()) {
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            double z1 = in.nextDouble();
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            double z2 = in.nextDouble();

            System.out.printf("%.2f%n", Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2)));
        }
    }
}
