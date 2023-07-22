import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Carolyn {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carolyn.dat"));
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            String a = in.next();
            int cnt = 1;
            String out = "";

            if (a.charAt(0) <= a.charAt(1)) {
                for (char c = a.charAt(0); c <= a.charAt(1); c++) {
                    out += ("" + c).repeat(cnt++) + "\n";
                }
            } else if (a.charAt(0) > a.charAt(1)) {
                for (char c = a.charAt(0); c >= a.charAt(1); c--)
                    out += ("" + c).repeat(cnt++) + "\n";
            }

            System.out.println(out.stripTrailing());
        }
    }
}
