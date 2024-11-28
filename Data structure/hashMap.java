//Import Hashmap
import java.util.HashMap;
public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        //Put cap gia tri vao HashMap
        mp.put(100, 1);
        mp.put(20, 4);
        mp.put(90, 3);
        mp.put(1000, 1);
        mp.put(400, 2);
        System.out.println(mp.size());
        System.out.println(mp);

        //Access an Item
        System.out.println(mp.get(100));

        //Remove an Item
        mp.remove(1000);//Xoa so 1000 ra khoi map
        System.out.println(mp);

        //Loop in HashMap
        //Print key
        for(Integer i : mp.keySet()){
            System.out.print(i+" ");
        }
        System.out.println("");
        //Print value
        for(Integer i : mp.values()){
            System.out.print(i+" ");
        }
        System.out.println("");
        //Print key and value
        for(Integer i : mp.keySet()){
            System.out.println("Key: "+i+" has Value: "+mp.get(i));
        }
    }
}
