package J07073_dangkyhinhthucday;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(sc.nextLine());
        List<MonHoc> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MonHoc(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list);
        for(MonHoc it : list){
            if(!it.getMethodPractice().equals("Truc tiep")){
                System.out.println(it);
            }
        }
    }
}
