package J05009_thukhoakithi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<ThiSinh> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(i,sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine()),Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list);
        Float Max=list.get(0).getTotal();
        for(ThiSinh x : list){
            if(Float.compare(x.getTotal(),Max)==0){
                System.out.println(x);
            }
        }
    }
}
