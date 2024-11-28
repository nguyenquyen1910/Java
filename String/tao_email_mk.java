import java.util.Scanner;
import java.util.TreeMap;
public class tao_email_mk {
    public static String createPass(String s){
        StringBuilder str=new StringBuilder(s);
        str.delete(2,3);
        str.delete(4,5);
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        TreeMap<String,Integer> mp=new TreeMap<>();
        sc.nextLine();
        for(int test=0;test<n;test++){
            String s=sc.nextLine();
            String[] ans=s.split("\\s++");
            String res="";
            res+=ans[ans.length-2];
            res=res.toLowerCase();
            for(int i=0;i<ans.length-2;i++){
                res+=ans[i].charAt(0);
            }
            res=res.toLowerCase();
            if(!mp.containsKey(res)){
                System.out.println(res+"@xyx.edu.vn");
                mp.put(res, 1);
            }
            else{
                System.out.println(res+(""+(mp.get(res)+1))+"@xyx.edu.vn");
                mp.put(res,mp.get(res)+1);
            }
            System.out.println(createPass(ans[ans.length-1]));
        }
    }
}
