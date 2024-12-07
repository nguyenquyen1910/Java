import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimTuDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());
        }
        String x = list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i).length() > x.length()){
                x = list.get(i);
            }
        }
        System.out.println(x+" - "+x.length());
    }
}
