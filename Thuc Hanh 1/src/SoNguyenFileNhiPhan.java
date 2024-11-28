import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SoNguyenFileNhiPhan {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Set<Integer> set = new TreeSet<>();
        for(String it : list){
            String[] tmp = it.split("\\s+");
            for(String token : tmp){
                try {
                    int num = Integer.parseInt(token);
                    set.add(num);
                } catch (NumberFormatException e) {

                }
            }
        }
        set.forEach(System.out::println);

    }
}
