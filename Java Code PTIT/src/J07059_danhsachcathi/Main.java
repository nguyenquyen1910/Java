package J07059_danhsachcathi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<CaThi> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new CaThi(i,sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(CaThi it : list){
            System.out.println(it);
        }
    }
}
