import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ChuanHoaVaSapXep {
    public static String solveFullname(String s){
        String res="";
        String[] tmp = s.split("\\s+");
        for(String it : tmp){
            res+=it.substring(0,1).toUpperCase() + it.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(solveFullname(sc.nextLine().trim()));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] tmp1 = o1.split("\\s+");
                String[] tmp2 = o2.split("\\s+");
                int res = tmp1[tmp1.length-1].compareTo(tmp2[tmp2.length-1]);
                if(res!=0){
                    return res;
                }
                return o1.compareTo(o2);
            }
        });
        list.forEach(System.out::println);
    }

}
