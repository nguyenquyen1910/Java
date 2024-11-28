import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuanHoaXauHoTen {
    public static String solveFullname(String s){
        String res="";
        String[] tmp = s.split("\\s+");
        for(String it : tmp) {
            res+=it.substring(0,1).toUpperCase()+it.substring(1,it.length()).toLowerCase()+" ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while(true){
            String input = sc.nextLine();
            if(input.equals("END")){
                break;
            }
            list.add(solveFullname(input.trim()));
        }
        for(String it : list) {
            System.out.println(it);
        }
    }
}
