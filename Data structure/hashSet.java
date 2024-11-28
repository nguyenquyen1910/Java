//Import hashset
import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        HashSet<String> vehicle=new HashSet<>();
        // add item
        vehicle.add("car");
        vehicle.add("bike");
        vehicle.add("motobike");
        vehicle.add("truck");
        vehicle.add("plane");
        System.out.println(vehicle.size());
        System.out.println(vehicle);

        //Check if an item in hashset
        if(vehicle.contains("car")){
            System.out.println("YES");
        }
        else System.out.println("NO");

        //Remove an item
        vehicle.remove("motobike");

        //Loop in hashset
        for(String s : vehicle){
            if(s.length()==4){
                System.out.println(s);
            }
        }
    }
}
