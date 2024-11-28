package J05033_sapxepthoigian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<ThoiGian> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new ThoiGian(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(a);
        for(ThoiGian it : a){
            System.out.println(it.toString());
        }
    }
}
