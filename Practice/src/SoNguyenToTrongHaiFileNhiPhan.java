import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SoNguyenToTrongHaiFileNhiPhan {
    public static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        Map<Integer, Integer> map1 = new TreeMap<>();
        for(Integer it : list1){
            if(isPrime(it)){
                map1.put(it, map1.getOrDefault(it, 0)+1);
            }
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Map<Integer, Integer> map2 = new TreeMap<>();
        for(Integer it : list2) {
            if(isPrime(it) && map1.containsKey(it)){
                map2.put(it, map2.getOrDefault(it, 0)+1);
            }
        }
        map2.forEach((k, v) -> {
            System.out.println(k+" "+map1.get(k)+" "+v);
        });
    }
}
