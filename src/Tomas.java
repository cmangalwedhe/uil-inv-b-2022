import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Tomas {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("tomas.dat"));
        int TC = in.nextInt();
        in.nextLine(); in.nextLine();

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(0, " ");

        while(in.hasNextLine()) {
            String lined = in.nextLine();
            if (lined.isBlank()) continue;
            String[] line = lined.split(" ");

            String out = "";

            for (String word : line) {
                int num = Integer.parseInt(word.substring(0, 1));
                int cnt = 0;
                char c = 32;

                while (cnt < word.length()) c = map.get(num).charAt(cnt++ % map.get(num).length());

                out += c;
            }

            if (in.hasNextLine()) in.nextLine();
            System.out.println(out);
        }
    }
}
