import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SoKhongGiamFileNhiPhan {

    public static boolean isNotReduce(int n) {
        String s = Integer.toString(n);
        if(s.length()<2){
            return false;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) ois1.readObject();

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        Map<Integer, Integer> map1 = new TreeMap<>();
        list1.forEach(e -> {
            if(isNotReduce(e)){
                map1.put(e, map1.getOrDefault(e, 0) + 1);
            }
        });

        Map<Integer, Integer> map2 = new TreeMap<>();
        list2.forEach(e -> {
            if(isNotReduce(e) && map1.containsKey(e)){
                map2.put(e, map2.getOrDefault(e, 0) + 1);
            }
        });
        map2.forEach((k, v) -> {
            System.out.println(k+" "+map1.get(k)+" "+v);
        });
    }
}
