package J05019_luongmuatrungbinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Station> stations = new HashMap<String, Station>();
        List<Station> listStation = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            if(!stations.containsKey(s)){
                stations.put(s, new Station(stations.size(), s));
                listStation.add(stations.get(s));
            }
            stations.get(s).addRain(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()));
        }
        listStation.forEach(System.out::println);
    }
}
