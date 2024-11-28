import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class SoDep1 {
    public static boolean checkNum(String x){
        for(int i=0;i<x.length()-1;i++){
            if((x.charAt(i)-'0')>(x.charAt(i+1)-'0')){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<String> list = (ArrayList<String>) ois.readObject();
            ArrayList<String> list2 = (ArrayList<String>) ois2.readObject();
            Map<String,Integer> mp=new TreeMap<>();
            Map<String,Integer> mp2=new TreeMap<>();
            for(int i=0;i<list.size();i++){
                if(mp.get(list.get(i))==null){
                    mp.put(list.get(i),0);
                }
                else{
                    mp.put(list.get(i),mp.get(list.get(i))+1);
                }
            }
            for(int i=0;i<list2.size();i++){
                if(mp2.get(list2.get(i))==null){
                    mp2.put(list2.get(i),0);
                }
                else{
                    mp2.put(list2.get(i),mp2.get(list2.get(i))+1);
                }
            }
            for(Map.Entry<String,Integer> entry:mp.entrySet()){
                if(mp2.get(entry.getKey())!=null){

                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
