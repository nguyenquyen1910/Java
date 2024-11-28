import java.util.*;

public class SoNguyenThuy {
    public static Scanner sc = new Scanner(System.in);
    public static boolean isRev(String x){
        StringBuilder str = new StringBuilder(x);
        return x.equals(str.reverse().toString());
    }
    public static void testCase(){
        int n=sc.nextInt();
        Queue<String> q = new LinkedList<String>();
        List<String> list = new ArrayList<>();
        q.add("4");
        q.add("5");
        while(list.size()<n){
            String x = q.poll();
            if(isRev(x) && x.length()%2==0){
                list.add(x);
            }
            q.add(x + "4");
            q.add(x + "5");
        }
        for(String x : list){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
            System.out.println();
        }
    }
}
