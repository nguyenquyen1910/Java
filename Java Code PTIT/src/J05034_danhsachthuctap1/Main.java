package J05034_danhsachthuctap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Information> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Information(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);

        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            for(Information it : list){
                if(it.getGroup().equals(s)){
                    System.out.println(it);
                }
            }
        }
    }
}
