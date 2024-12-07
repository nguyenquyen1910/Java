import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SoNguyenToTrong2File {
    public static boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        Map<Integer, Integer> map1 = new TreeMap<>();
        list1.stream()
                .filter(e -> isPrime(e))
                .forEach(e -> map1.put(e, map1.getOrDefault(e, 0) + 1));

        Map<Integer, Integer> map2 = new TreeMap<>();
        list2.stream()
                .filter(e -> isPrime(e) && map1.containsKey(e))
                .forEach(e -> map2.put(e, map2.getOrDefault(e, 0) + 1));

        for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
            System.out.println(entry.getKey()+" "+map1.get(entry.getKey())+" "+entry.getValue());
        }
    }
}
