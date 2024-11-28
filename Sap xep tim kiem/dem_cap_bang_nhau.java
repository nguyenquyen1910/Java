import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dem_cap_bang_nhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(map.containsKey(x)){
                int fre=map.get(x);
                map.put(x, fre+1);
            }
            else{
                map.put(x, 1);
            }
        }
        Long ans=0;
        Set<Map.Entry<Integer,Integer>> entry=map.entrySet();
        for(Map.Entry<Integer,Integer> x : entry){
            ans+=((long)x.getValue()*(x.getValue()-1))/2;
        }
        System.out.println(ans);
    }
}
