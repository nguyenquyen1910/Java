import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        };
        PriorityQueue<Integer> pq=new PriorityQueue<>(comp);
        pq.add(100);
        pq.add(500);
        pq.add(10);
        pq.add(70);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
    }
}
