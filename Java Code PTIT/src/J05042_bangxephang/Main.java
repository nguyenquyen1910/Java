package J05042_bangxephang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Submit> submits = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String[] tmp = sc.nextLine().trim().split("\\s+");
            submits.add(new Submit(name, Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1])));
        }
        Collections.sort(submits);
        for(Submit submit : submits){
            System.out.println(submit);
        }
    }
}
