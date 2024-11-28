import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(100);
        q.add(200);
        q.add(300);
        q.add(400);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.poll());//Dau hang doi(vua lay vua xoa)
        System.out.println(q.peek());//Chi lay o dau hang doi
    }
}
