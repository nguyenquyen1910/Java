package J05049_lietkenhapxuathangtheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<HangHoa> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new HangHoa(sc.nextLine(),Long.parseLong(sc.nextLine())));
        }
        Collections.sort(list);
        String x=sc.nextLine();
        for(HangHoa it : list){
            if(it.getGroup().equals(x)){
                System.out.println(it.toString());
            }
        }
    }
}
