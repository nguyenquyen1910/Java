import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimFiboNP {
    public static long[] fibo = new long[100];
    public static void init() {
        fibo[0]=0;
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<=92;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
    }

    public static boolean isFiboNum(int n) {
        for(int i=0;i<93;i++){
            if(fibo[i]==n) return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        init();
        Map<Integer, Integer> map = new TreeMap<>();
        list.forEach(e -> {
            if (isFiboNum(e)) {
                map.put(e, map.getOrDefault(e, 0)+1);
            }
        });

        map.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });
    }
}
