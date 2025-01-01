import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SoNTBaChuSo {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Set<Integer> set = new TreeSet<>();

        list.forEach(e -> {
            if(isPrime(e) && e>=100){
                set.add(e);
            }
        });

        set.forEach(System.out::println);
    }
}
