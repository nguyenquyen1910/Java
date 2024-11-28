package J05011_tinhgio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<TimePlay> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new TimePlay(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(TimePlay it : list){
            System.out.println(it.toString());
        }
    }
}
