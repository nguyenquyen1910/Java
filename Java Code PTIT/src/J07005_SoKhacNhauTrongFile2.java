import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        DataInputStream dis=new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer,Integer> mp=new TreeMap<>();
        for(int i=0;i<100000;i++){
            int num=dis.readInt();
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        mp.forEach((k,v) ->{
            System.out.printf("%d %d\n",k,v);
        });
    }
}
