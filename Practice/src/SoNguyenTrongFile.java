import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoNguyenTrongFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Set<Integer> set = new TreeSet<>();
        list.forEach(e -> {
            String[] tmp = e.trim().split("\\s+");
            Arrays.asList(tmp).forEach(it -> {
                try{
                    set.add(Integer.parseInt(it));
                } catch (NumberFormatException ignored){

                }
            });
        });
        set.forEach(System.out::println);
    }
}
