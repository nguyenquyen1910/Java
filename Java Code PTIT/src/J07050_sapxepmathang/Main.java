package J07050_sapxepmathang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<MatHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MatHang(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(MatHang it : list){
            System.out.println(it);
        }
    }
}
