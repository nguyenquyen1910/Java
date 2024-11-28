package thoigianonline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<ThoiGian> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThoiGian(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(ThoiGian tg : list){
            System.out.println(tg.toString());
        }
    }
}

/*
Do Viet Anh
11/12/2021 16:35:00
11/12/2021 17:35:00
Le Tuan Anh
11/12/2021 16:45:00
11/12/2021 18:15:00
Nguyen Tuan Anh
11/12/2021 17:00:00
11/12/2021 19:15:00
 */
