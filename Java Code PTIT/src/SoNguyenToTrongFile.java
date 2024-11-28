import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SoNguyenToTrongFile {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
            ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
            Set<Integer> primeSet = new HashSet<>();
            for (Integer num : list) {
                if (num >= 100 && isPrime(num)) {
                    primeSet.add(num);
                }
            }
            List<Integer> a = primeSet.stream().sorted().collect(Collectors.toList());
            for (Integer i : a) {
                System.out.println(i);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
