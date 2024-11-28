import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class dem_so_khong_giam {
    public static int giam(int n){
        while(n!=0){
            int r=n%10;
            n/=10;
            int a=n%10;
            if(a>r) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        while(sc.hasNext()){
            int x=sc.nextInt();
            if(giam(x)){
                if(map.containsKey(x)){
                    int fre=map.get(x);
                    map.put(x, fre+1);
                }
                else{
                    map.put(x, 1);
                }
            }
            Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
            Integer[][] a = new Integer[map.size()][2];
            int i=0;
            for(Map.Entry<Integer,Integer> entry : entrySet){
                a[i][0]=entry.getKey();
                a[i][1]=entry.getValue();
                ++i;
            }
            Arrays.sort(a,new Comparator<Integer []>() {
                @Override
                public int compare(Integer o1[],Integer o2[]){
                    if(o1[1]!=o2[1]){
                        return o2[1]-o1[1];
                    }
                    return o1[0]-o2[0];
                }
            });
            for(int j=0;j<i;i++){
                System.out.println(a[j][0]+" "+a[j][1]);
            }
        }
    }    
}
