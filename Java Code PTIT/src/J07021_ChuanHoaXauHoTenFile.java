import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenFile {
    public static String nameRemake(String name){
        if(name.length()==1){
            return name.toUpperCase();
        }
        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String line = sc.nextLine();
            if(line.equals("END")) {
                break;
            }
            String[] tmp=line.trim().split("\\s+");
            String res="";
            for(String it : tmp){
                res+=nameRemake(it)+" ";
            }
            System.out.println(res);
        }
    }
}
