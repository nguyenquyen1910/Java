package luyentaplaptrinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String[] score = sc.nextLine().trim().split("\\s+");
            int correct = Integer.parseInt(score[0]);
            int submit = Integer.parseInt(score[1]);
            list.add(new SinhVien(name, correct, submit));
        }
        Collections.sort(list);
        for(SinhVien it : list){
            System.out.println(it);
        }
    }
}