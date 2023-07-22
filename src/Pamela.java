import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pamela {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("pamela.dat"));
        int TC = in.nextInt();

        for (int i = 1; i <= TC; i++) {
            int[][] mat = new int[in.nextInt()][in.nextInt()];

            for (int j = 0; j < mat.length; j++)
                for (int k = 0; k < mat[j].length; k++)
                    mat[j][k] = in.nextInt();

            String sums = "";
            String mins = "";
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            for (int j = 0; j < mat.length; j++) {
                sums += "%7d".formatted(Arrays.stream(mat[j]).sum());
                int mini = Arrays.stream(mat[j]).min().getAsInt();
                mins += "%7d".formatted(mini);
                min = Math.min(min, mini);
                max = Math.max(max, Arrays.stream(mat[j]).max().getAsInt());
            }

            String colSums = "", colMaxs = "";
            for (int j = 0; j < mat[0].length; j++) {
                int sum = 0;
                int colMax = Integer.MIN_VALUE;

                for (int k = 0; k < mat.length; k++) {
                    sum += mat[k][j];
                    colMax = Math.max(colMax, mat[k][j]);
                }

                colSums += "%7d".formatted(sum);
                colMaxs += "%7d".formatted(colMax);
            }

            System.out.printf("Case: %d%n", i);
            System.out.printf("Row Sums: %s%n", sums);
            System.out.printf("Row Mins: %s%n", mins);
            System.out.printf("Col Sums: %s%n", colSums);
            System.out.printf("Col Maxs: %s%n", colMaxs);
            System.out.printf("Min Mins: %7d%nMax Maxs: %7d%n", min, max);
            System.out.println("=".repeat(20));
        }
    }
}
