import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class ThongKeTuKhacNhauNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Map<String, Integer> map = new TreeMap<>();
        list.forEach(e -> {
            String[] tmp = e.toLowerCase().split("[^a-z0-9]");
            Arrays.asList(tmp).forEach(it -> {
                if (!it.isEmpty()) {
                    map.put(it.toLowerCase(), map.getOrDefault(it.toLowerCase(), 0) + 1);
                }
            });
        });

        List<Map.Entry<String, Integer>> res = new ArrayList<>(map.entrySet());
        res.sort((a, b) -> {
            if (a.getValue() != b.getValue()) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        res.forEach(e -> {
            System.out.println(e.getKey() + " " + e.getValue());
        });
    }
}
