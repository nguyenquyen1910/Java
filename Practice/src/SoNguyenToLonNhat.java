import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SoNguyenToLonNhat {
    public static boolean isPrime(int n) {
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> map = new TreeMap<>();
        for(Integer it : list) {
            if(isPrime(it)){
                map.put(it, map.getOrDefault(it, 0) + 1);
            }
        }
        int cnt=0;
        for(int i=1000000;i>=2;i--){
            if(map.containsKey(i)){
                System.out.println(i+" "+map.get(i));
                cnt++;
                if(cnt==10){
                    break;
                }
            }
        }
    }
}
