import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class CapNguyenToTrongFile2 {
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
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        list.forEach(e -> {
            if(isPrime(e)){
                set.add(e);
            }
        });

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> set2 = new TreeSet<>();
        list2.forEach(e -> {
            if(isPrime(e)){
                set2.add(e);
            }
        });

        int sum=1000000;
        for(Integer it : set) {
            if(it>=(sum-it)) break;
            if(set.contains(sum-it) && !set2.contains(it) && !set2.contains(sum-it)){
                System.out.println(it+" "+(sum-it));
            }
        }
    }
}
