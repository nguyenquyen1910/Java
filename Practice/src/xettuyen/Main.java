package xettuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ThiSinh(i, sc.nextLine().trim(), sc.nextLine().trim(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        list.forEach(System.out::println);
    }
}
