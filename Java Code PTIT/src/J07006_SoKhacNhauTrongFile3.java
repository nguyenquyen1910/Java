import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> map = new TreeMap<>();
        list.forEach(e -> {
            map.put(e, map.getOrDefault(e, 0)+1);
        });
        map.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });
    }
}
