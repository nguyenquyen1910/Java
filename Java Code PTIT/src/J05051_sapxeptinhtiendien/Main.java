package J05051_sapxeptinhtiendien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Information> informationList = new ArrayList<>();
        for(int i=0;i<n;i++){
            informationList.add(new Information(i,sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(informationList);
        informationList.forEach(System.out::println);
    }
}
