import java.io.*;
import java.util.*;

public class J07040_LIetKeTheoThuTuFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list1 = (ArrayList<String>) ois.readObject();
        Set<String> set1 = new TreeSet<>();
        for(String i : list1){
            String[] tmp=i.trim().toLowerCase().split("\\s+");
            set1.addAll(Arrays.asList(tmp));
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(set1.contains(s)){
                System.out.println(s);
                set1.remove(s);
            }
        }

    }
}
