package J05050_tinhtiendien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<ElectronicUsed> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ElectronicUsed(i,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for(ElectronicUsed it : list){
            System.out.println(it.toString());
        }
    }
}
