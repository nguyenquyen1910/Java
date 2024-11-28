import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class LietKeTheoTTXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ois.close();
        Set<String> se = new HashSet<>();
        for (String s : a) {
            String[] words = s.toLowerCase().split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    se.add(word);
                }
            }
        }
        Set<String> res = new LinkedHashSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String word = sc.next().toLowerCase();
            if (se.contains(word)) {
                res.add(word);
            }
        }
        sc.close();
        for (String i : res) {
            System.out.println(i);
        }
    }
}
