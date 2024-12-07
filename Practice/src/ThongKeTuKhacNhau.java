import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ThongKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            String[] tmp = sc.nextLine().toLowerCase().split("[^a-z0-9]");
            Arrays.asList(tmp).forEach(e -> {
                if(!e.isEmpty()){
                    map.put(e.toLowerCase(), map.getOrDefault(e.toLowerCase(), 0) + 1);
                }
            });
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (o1.getValue() != o2.getValue()) {
                return o2.getValue() - o1.getValue();
            }
            return o1.getKey().compareTo(o2.getKey());
        });

        list.forEach(e -> {
            System.out.println(e.getKey()+" "+e.getValue());
        });
    }
}
