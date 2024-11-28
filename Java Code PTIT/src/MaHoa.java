import java.util.*;

public class MaHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            int originalIndex = Integer.parseInt(sc.nextLine()) - 1;

            int len = s.length();
            List<String> matrix = new ArrayList<>(Collections.nCopies(len, ""));
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    matrix.set(j, s.charAt(j) + matrix.get(j));
                }
                Collections.sort(matrix);
            }
            System.out.println(matrix.get(originalIndex));
        }
    }
}
