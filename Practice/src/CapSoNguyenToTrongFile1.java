import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile1 {
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
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> set1 = new TreeSet<>();
        list1.forEach(e ->{
            if(isPrime(e)){
                set1.add(e);
            }
        });

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois1.readObject();
        HashSet<Integer> set2 = new HashSet<>();
        list2.forEach(e ->{
            if(isPrime(e)){
                set2.add(e);
            }
        });
        int sum=1000000;
        for(Integer e:set1){
            if(e*2>=sum) break;
            if(set2.contains(sum-e)){
                System.out.println(e+" "+(sum-e));
            }
        }
    }
}
