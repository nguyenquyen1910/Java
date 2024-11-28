import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFile {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list= (ArrayList<Integer>) in.readObject();
        Map<Integer,Integer> mp=new TreeMap<>();
        for(Integer it : list){
            if(isPrime(it)){
                mp.put(it,mp.getOrDefault(it,0)+1);
            }
        }
        mp.forEach((k,v) ->{
            System.out.printf("%d %d\n",k,v);
        });

    }
}
