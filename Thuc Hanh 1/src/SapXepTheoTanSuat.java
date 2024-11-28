import java.util.*;

public class SapXepTheoTanSuat {
    public static Scanner sc = new Scanner(System.in);
    public static void testCase(){
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
            mp.put(list.get(i),mp.getOrDefault(list.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            testCase();
        }
    }
}
