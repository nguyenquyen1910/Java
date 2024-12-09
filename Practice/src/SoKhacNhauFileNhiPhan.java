import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoKhacNhauFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Set<Integer> set = new TreeSet<>();
        list.forEach(e -> {
            String[] tmp = e.trim().split("\\s+");
            for(String it : tmp) {
                try {
                    set.add(Integer.parseInt(it));
                } catch (NumberFormatException exception){

                }
            }
        });

        set.forEach(System.out::println);
    }
}
