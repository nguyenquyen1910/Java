import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;

public class bien_doi_s_t {
    public static void testCase(Scanner sc){
        int s = sc.nextInt();
        int t = sc.nextInt();
        Queue<Entry<Integer, Integer>> q = new LinkedList<>();
        TreeSet<Integer> se = new TreeSet<>();
        q.add(new AbstractMap.SimpleEntry<>(s, 0));
        se.add(s);
        
        while (!q.isEmpty()) {
            Entry<Integer, Integer> top = q.poll();
            int newNum = top.getKey();
            int step = top.getValue();
            if (newNum == t) {
                System.out.println(step);
                return;
            }
            if (newNum - 1 >= 0 && !se.contains(newNum - 1)) {
                q.add(new AbstractMap.SimpleEntry<>(newNum - 1, step + 1));
                se.add(newNum - 1);
            }
            if (newNum * 2 <= t * 2 && !se.contains(newNum * 2)) {
                q.add(new AbstractMap.SimpleEntry<>(newNum * 2, step + 1));
                se.add(newNum * 2);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            testCase(sc);
            t--;
        }
    }
}
