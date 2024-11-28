import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String input = sc.next();
            try {
                int n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                list.add(input);
            }
        }
        Collections.sort(list);
        list.forEach(e -> {
            System.out.print(e+" ");
        });
    }
}
