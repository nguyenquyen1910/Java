import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemMocThoiGian {
    private static boolean isValid(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        if(hour < 0 || hour >= 24){
            return false;
        }
        int minute = Integer.parseInt(s.substring(3, 5));
        if(minute < 0 || minute >= 60){
            return false;
        }
        int second = Integer.parseInt(s.substring(6, 8));
        if(second < 0 || second >= 60){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                if(isValid(matcher.group(0))){
                    set.add(matcher.group(0));
                }
            }
        }
        set.forEach(System.out::println);
    }
}
