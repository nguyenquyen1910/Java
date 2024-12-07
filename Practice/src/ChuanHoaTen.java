import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChuanHoaTen {
    public static String formatName(String s) {
        String res="";
        String[] tmp = s.trim().split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase()+it.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(!s.equals("END")){
                System.out.println(formatName(s));
            }
            else{
                break;
            }
        }
    }
}
