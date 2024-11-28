import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhDauSanPhamLoi {
    public static String solve(List<Integer> list){
        List<String> res = new ArrayList<>();
        int start = list.get(0);
        int prev = start;
        for(int i=1;i<list.size();i++){
            int cur = list.get(i);
            if(cur != prev+1){
                if(start == prev){
                    res.add(String.valueOf(start));
                }
                else{
                    res.add(start + "-" + prev);
                }
                start = cur;
            }
            prev = cur;
        }
        if(start == prev){
            res.add(String.valueOf(start));
        }
        else{
            res.add(start + "-" + prev);
        }
        return String.join(", ", res.subList(0, res.size() - 1)) + " and " + res.get(res.size() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> correct = new ArrayList<>();
        List<Integer> errors = new ArrayList<>();
        int[] cnt= new int[n+5];
        for(int i=0;i<m;i++){
            list.add(sc.nextInt());
            cnt[list.get(i)]++;
        }
        for(int i=1;i<=n;i++){
            if(cnt[i]==0){
                correct.add(i);
            }
            else{
                errors.add(i);
            }
        }
        System.out.print("Errors: ");
        System.out.println(solve(errors));
        System.out.print("Correct: ");
        System.out.println(solve(correct));
    }
}
