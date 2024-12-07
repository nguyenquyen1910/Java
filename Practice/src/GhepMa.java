import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GhepMa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<String> list1 = (ArrayList<String>) ois1.readObject();
        Set<String> set1 = new TreeSet<>(list1);
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> set2 = new TreeSet<>(list2);

        set1.forEach(e -> {
            set2.forEach(it -> {
                System.out.println(e+String.format("%03d", it));
            });
        });
    }
}
