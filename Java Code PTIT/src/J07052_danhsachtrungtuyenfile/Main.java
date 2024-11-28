package J07052_danhsachtrungtuyenfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String solveName(String name) {
        name = name.trim().replaceAll("\\s+", " ");
        String[] tmp = name.split(" ");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += Character.toUpperCase(tmp[i].charAt(0)) + tmp[i].substring(1).toLowerCase() + " ";
        }
        name = name.trim();
        return name;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(sc.nextLine(),solveName(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        int k = Integer.parseInt(sc.nextLine());
        Collections.sort(list);
        double benchmark = list.get(k - 1).getTotalScore();
        for(ThiSinh it : list){
            if(it.getTotalScore() >= benchmark){
                it.setStatus("TRUNG TUYEN");
            }
            else{
                it.setStatus("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", benchmark));
        for(ThiSinh it : list){
            System.out.println(it);
        }
    }
}
