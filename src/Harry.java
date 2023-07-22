import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Harry {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("harry.dat"));
        int TC = in.nextInt();

        for (int i = 0; i < TC; i++) {
            String word = in.next(), regex = in.next();
            String r = word.replaceAll("[" + regex + "]", "");
            System.out.println(r.length() == 0 ? "ALL LETTERS ARE GONE" : r);
        }
    }
}
