import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateBinaryFile {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(rand.nextInt(1000) + 1);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"))) {
            oos.writeObject(list);
        }
        System.out.println("File DATA.in đã được tạo!");
    }
}
