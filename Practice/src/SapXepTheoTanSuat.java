import java.util.*;

public class SapXepTheoTanSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            Map<Integer, Integer> linkedMap = new LinkedHashMap<>();
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                list.add(num);
                map.put(num, map.getOrDefault(num, 0)+1);
                if(!linkedMap.containsKey(num)){
                    linkedMap.put(num, i);
                }
            }

            list.sort((a, b) -> {
                if(map.get(a) != map.get(b)){
                    return map.get(b) - map.get(a);
                }
                return linkedMap.get(a) - linkedMap.get(b);
            });

            for(Integer it : list){
                System.out.print(it+" ");
            }
            System.out.println();
        }
    }
}
