import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        while(true){
            boolean ok=true;
            for(int i=0;i<a.size()-1;i++){
                if((a.get(i)+a.get(i+1))%2==0){
                    a.remove(i+1);
                    a.remove(i);
                    --i;
                    ok=false;
                }
            }
            if(ok){
                System.out.print(a.size());
                return;
            }
        }
    }
}
