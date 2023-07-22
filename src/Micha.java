import java.io.File;
import java.io.IOException;
import java.util.*;

public class Micha {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("micha.dat"));
        int TC = in.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < TC; i++) {
            map.put(in.next(), 0);
        }

        while (in.hasNext()) {
            String word = in.next();

            for (String a: map.keySet()) {
                if (word.contains(a))
                    map.merge(a, 1, Integer::sum);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        map.keySet().forEach(x -> list.add("\"%s\" %d".formatted(x, map.get(x))));
        list.sort(Comparator.comparing(a -> new StringBuilder(a).reverse().toString()));
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
