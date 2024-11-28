import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class J07031_CapSoNguyenToFile2 {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        Set<Integer> set1 = new TreeSet<>();
        for(Integer i : list1){
            if(isPrime(i)){
                set1.add(i);
            }
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> set2 = new TreeSet<>();
        for(Integer i : list2){
            if(isPrime(i)){
                set2.add(i);
            }
        }

        int finalSum=1000000;
        for(Integer i : set1){
            if(i>=finalSum-i){
                break;
            }
            if(set1.contains(finalSum-i) && !set2.contains(i) && !set2.contains(finalSum-i)){
                System.out.println(i+" "+(finalSum-i));
            }
        }
    }
}
