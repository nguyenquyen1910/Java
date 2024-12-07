import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TaoEmail {
    public static String formatName(String name) {
        String[] parts = name.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part.substring(0, 1).toUpperCase())
                    .append(part.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }

    public static String generateEmail(String fullName) {
        String[] nameParts = fullName.trim().split("\\s+");
        String email = nameParts[nameParts.length - 1].toLowerCase();
        for (int i = 0; i < nameParts.length - 1; i++) {
            email += nameParts[i].toLowerCase().charAt(0);
        }
        return email;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            String formated = formatName(s);
            if(!set.contains(formated)){
                set.add(formated);
                list.add(generateEmail(formated));
            }
        }
        Map<String, Integer> map = new TreeMap<>();
        List<String> res = new ArrayList<>();
        list.forEach(e -> {
            if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
                res.add(e+map.get(e).toString()+"@ptit.edu.vn");
            }
            else{
                map.put(e, 1);
                res.add(e+"@ptit.edu.vn");
            }
        });
        res.forEach(System.out::println);
    }
}
