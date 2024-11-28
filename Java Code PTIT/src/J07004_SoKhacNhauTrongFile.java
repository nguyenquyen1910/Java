import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> mp=new TreeMap<>();
        while(sc.hasNext()){
            int n=sc.nextInt();
            if(mp.containsKey(n)){
                mp.put(n,mp.get(n)+1);
            }
            else{
                mp.put(n,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
