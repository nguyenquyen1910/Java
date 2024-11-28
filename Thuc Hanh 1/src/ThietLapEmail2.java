import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ThietLapEmail2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Set<String> set = new HashSet<>();
        List<String> names = new ArrayList<>();
        while(sc.hasNext()){
            String[] tmp = sc.nextLine().trim().toLowerCase().split("\\s+");
            String name="";
            for(int i=0;i<tmp.length;i++){
                name+=tmp[i]+" ";
            }
            if (!set.contains(name.trim())) {
                names.add(name.trim());
                set.add(name.trim());
            }
        }
        List<String> res= new ArrayList<>();
        for(String it : names){
            String[] tmp = it.split("\\s+");
            String name = tmp[tmp.length-1];
            for(int i=0;i<tmp.length-1;i++){
                name+=tmp[i].charAt(0);
            }
            res.add(name);
            int cnt= Collections.frequency(res,name);
            name+=(cnt==1 ? "" : cnt)+"@ptit.edu.vn";
            System.out.println(name);
        }
    }
}