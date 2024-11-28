import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class SoKhacNhauFileNP {
        public static void main(String[] args) {
            try {

                FileInputStream file = new FileInputStream("DATA.in");
                ObjectInputStream obj = new ObjectInputStream(file);
                ArrayList<String> a = (ArrayList<String>) obj.readObject();
                obj.close();
                file.close();
                Set<Integer> set = new HashSet<>();
                for (String l : a) {
                    String[] w = l.split("\\s+");
                    for (String word : w) {
                        try {
                            int num = Integer.parseInt(word);
                            set.add(num);
                        } catch (NumberFormatException e) {

                        }
                    }
                }


                List<Integer> A = new ArrayList<>(set);
                Collections.sort(A);


                for (int number : A) {
                    System.out.println(number);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}
