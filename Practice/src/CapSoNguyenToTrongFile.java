import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class CapSoNguyenToTrongFile {
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
        List<Integer> list = (ArrayList<Integer>) ois.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> set2 = new TreeSet<>();
        list2.stream().filter(CapSoNguyenToTrongFile::isPrime).forEach(set2::add);
        int sum = 1000000;
        Set<Integer> set = list.stream()
                .filter(e -> isPrime(e) && !set2.contains(e) && !set2.contains(sum-e))
                .collect(Collectors.toCollection(TreeSet::new));

        for(Integer it : set){
            if(it < sum-it && set.contains(sum-it)){
                System.out.println(it+" "+(sum-it));
            }
        }
    }
}
