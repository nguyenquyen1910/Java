import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class J07012_DifferentWordBinaryFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        Map<String,Integer> mp = new TreeMap<>();
        for(String it : list){
            if(it.length() == 0){
                continue;
            }
            String[] tmp = it.toLowerCase().trim().split("[^a-z0-9]");
            for(String word : tmp){
                if(word.length() > 0){
                    if(!mp.containsKey(word)){
                        mp.put(word,1);
                    }
                    else{
                        mp.put(word,mp.get(word)+1);
                    }
                }
            }
        }
        List<Map.Entry<String,Integer>> a = new ArrayList<>(mp.entrySet());
        a.sort((x,y) -> {
            if(x.getValue() != y.getValue()){
                return y.getValue() - x.getValue();
            }
            return x.getKey().compareTo(y.getKey());
        });
        for(Map.Entry<String,Integer> it : a){
            System.out.println(it.getKey()+" "+it.getValue());
        }
    }
}
