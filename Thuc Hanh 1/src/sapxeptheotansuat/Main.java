package sapxeptheotansuat;

import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        Map<Integer, Integer> mapIndex = new HashMap<>();
        Map<Integer, Integer> mapCount = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!mapIndex.containsKey(x)) {
                mapIndex.put(x, i);
                mapCount.put(x, 1);
            } else {
                mapCount.put(x, mapCount.get(x) + 1);
            }
        }
        List<PhanTu> list = new ArrayList<>();
        for(Integer i : mapIndex.keySet()) {
            int firstIndex=mapIndex.get(i);
            int count=mapCount.get(i);
            list.add(new PhanTu(i,firstIndex,count));
        }
        Collections.sort(list);
        for(PhanTu e : list) {
            for(int i = 0; i < e.count; i++) {
                System.out.print(e.value + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
            System.out.println();
        }
    }
}
