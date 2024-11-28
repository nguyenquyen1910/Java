import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SoKhacNhauTrongFile {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        DataInputStream ois=new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer,Integer> mp=new TreeMap<>();
        for(int i=0;i<100000;i++){
            int index=ois.readInt();
            if(mp.get(index)==null){
                mp.put(index,1);
            }
            else{
                mp.put(index,mp.get(index)+1);
            }
        }
        mp.forEach((k,v) -> {
            System.out.printf("%d %d\n",k,v);
        });
    }
}
