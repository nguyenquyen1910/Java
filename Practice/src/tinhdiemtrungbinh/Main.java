package tinhdiemtrungbinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i, sc.nextLine().trim(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

        Collections.sort(list);
        int rank=1;
        list.get(0).setRank(rank);
        for(int i=1;i<list.size();i++){
            if(list.get(i-1).getDiemTrungBinh() == list.get(i).getDiemTrungBinh()){
                list.get(i).setRank(rank);
            }
            else{
                rank=i+1;
                list.get(i).setRank(rank);
            }
        }
        list.forEach(System.out::println);
    }
}
