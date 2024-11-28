import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SoNguyenToTrongFile {
    public static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> map = new TreeMap<>();
        for(Integer num : list) {
            if(isPrime(num)){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        map.forEach( (k,v) -> {
            System.out.println(k+" "+v);
        });
    }
}
