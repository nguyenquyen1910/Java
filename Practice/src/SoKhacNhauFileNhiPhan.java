import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauFileNhiPhan {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<100000;i++){
            int num = dis.readInt();
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        map.forEach( (k,v) -> {
            System.out.println(k+" "+v);
        });
    }
}
