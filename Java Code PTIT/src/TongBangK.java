import java.util.*;

public class TongBangK {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        HashMap<Long,Long> map = new HashMap<>();
        int n = sc.nextInt(),k = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextLong());
            map.put(list.get(i),map.getOrDefault(list.get(i),0L)+1);
        }
        long ans=0;
        for(Long it : list){
            long x = k-it;
            if(map.containsKey(x)){
                ans+=map.get(x);
                if(x==it){
                    ans--;
                }
            }
        }
        System.out.println(ans/2);
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
