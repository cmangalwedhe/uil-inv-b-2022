import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ewa {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ewa.dat"));
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            int N = in.nextInt();
            double volume = 0;

            for (int j = 0; j < N; j++) {
                String action = in.next();

                if (action.equals("BRING"))
                    volume += Math.PI * Math.pow(in.nextDouble(), 2) * in.nextDouble();
                else if (action.equals("EAT"))
                    volume -= in.nextDouble();

                System.out.printf("%.2f%n", volume);
            }

            System.out.println("----------");
        }
    }
}
