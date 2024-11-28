import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07011_DifferentWordInFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        sc.nextInt();
        Map<String,Integer> mp = new TreeMap<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            String[] tmp = s.trim().split("[^a-z0-9]");
            for(String it : tmp){
                if(it.length()>0){
                    mp.put(it.toLowerCase(),mp.getOrDefault(it,0)+1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b) ->{
            if(a.getValue() != b.getValue()){
                return b.getValue()-a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        for(Map.Entry<String,Integer> it : list){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
}
