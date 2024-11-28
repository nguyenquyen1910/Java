import java.util.*;

public class sap_xep_thuan_nghich {
    private static boolean isRevString(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            ++l;--r;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String[] res=s.split("\\s++");
        Arrays.sort(res,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2){
                int len1=o1.length();
                int len2=o2.length();
                if(len1!=len2)
                    return len1-len2;
                return 0;
            }
        });
        LinkedHashSet<String> se=new LinkedHashSet<>();
        for(String x : res){
            if(isRevString(x)){
                se.add(x);
            }
        }
        for(String x : se){
            System.out.print(x+" ");
        }
    }
}
