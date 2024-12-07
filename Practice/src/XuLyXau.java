import java.util.*;

public class XuLyXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            int sum=0;
            List<Character> res = new ArrayList<>();
            for(int j=0;j<s.length();j++){
                if(Character.isDigit(s.charAt(j))){
                    sum+=(s.charAt(j)-'0');
                }
                else{
                    res.add(s.charAt(j));
                }
            }
            Collections.sort(res);
            res.forEach(System.out::print);
            System.out.println(sum+"");
        }
    }
}
