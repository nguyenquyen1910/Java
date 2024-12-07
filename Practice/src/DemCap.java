import java.util.*;

public class DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        long cnt=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int start=i;
            while(!st.isEmpty() && list.get(st.peek()) <= list.get(i)){
                start = Math.min(start, st.pop());
            }
            cnt+=(i-start+1);
            st.push(i);
        }
        System.out.println(cnt);
    }
}
