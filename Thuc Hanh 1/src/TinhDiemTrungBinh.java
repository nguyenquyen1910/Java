import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Float> list = new ArrayList<>();
        Float max=0f, min=10f;
        for(int i=0;i<n;i++){
            list.add(sc.nextFloat());
            max=Math.max(max,list.get(i));
            min=Math.min(min,list.get(i));
        }
        Float res=0f;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(list.get(i).compareTo(max)!=0 && list.get(i).compareTo(min)!=0){
                res+=list.get(i);
                cnt++;
            }
        }
        System.out.println(String.format("%.2f",res/cnt));
    }
}
