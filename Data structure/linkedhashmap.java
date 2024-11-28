import java.util.*; 
// La 1 cau truc giong nhu unorderedmap o c++, khong sap xep cac key
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Quyen", 19);
        lhm.put("Nguyen", 20);
        lhm.put("Viet", 21);

        System.out.println(lhm.size());
        System.out.println(lhm);

        //Get an value of the key
        System.out.println(lhm.get("Quyen"));

        //Check lhm empty or not
        System.out.println(lhm.isEmpty());//tra ve true or false

        //Check for a key
        System.out.println(lhm.containsKey("Nguyen"));//tra ve true or false
    
        //Check for a value
        System.out.println(lhm.containsValue(20));//tra ve true or false
    
        //Remove entry
        lhm.remove("Viet");
    
        System.out.println(lhm);


        //Iterator in lhm
        for(Map.Entry<String,Integer> entry : lhm.entrySet()){
            //Lay gia tri key va value qua entry
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }    
}
