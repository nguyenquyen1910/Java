import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> time = new TreeSet<>();
        Pattern pattern = Pattern.compile("\\b([01]?\\d|2[0-3]):([0-5]\\d):([0-5]\\d)\\b");

        while(sc.hasNext()){
            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                time.add(matcher.group());
            }
       }
        for (String it : time) {
            System.out.println(it);
        }
    }
}
/*
[BeginLog]
[Boot Session: 2023/01/31 10:22:00.500]
09:50:44.356  WINWORD (0x43A4)
Section 2023/01/31 10:22:16, 538new
{FILE_QUEUE_COMMIT} 10:22:16.569
Start: 14:17:50.111over
End: 14:17:50.899over
 */
