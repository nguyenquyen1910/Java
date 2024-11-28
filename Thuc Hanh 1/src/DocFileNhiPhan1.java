import java.io.*;
import java.util.*;

public class DocFileNhiPhan1 {
    public static boolean idPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        Set<Integer> res = new TreeSet<>();
        for(Integer i : list){
            if(i>100 && idPrime(i)){
                res.add(i);
            }
        }
        for(Integer i : res){
            System.out.println(i);
        }
    }
}
