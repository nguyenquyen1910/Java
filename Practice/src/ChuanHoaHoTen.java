import java.util.Scanner;

public class ChuanHoaHoTen {
    public static String solveName1(String str) {
        String[] tmp = str.split("\\s+");
        String res = "";
        res+=tmp[tmp.length-1].substring(0,1).toUpperCase()+tmp[tmp.length-1].substring(1).toLowerCase()+" ";
        for(int i=0;i<tmp.length-1;i++){
            res+=tmp[i].substring(0,1).toUpperCase()+tmp[i].substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public static String solveName2(String str) {
        String res="";
        String[] tmp = str.split("\\s+");
        for(int i=1;i<tmp.length;i++){
            res+=tmp[i].substring(0,1).toUpperCase()+tmp[i].substring(1).toLowerCase()+" ";
        }
        res+=tmp[0].substring(0,1).toUpperCase()+tmp[0].substring(1).toLowerCase();
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            int option = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine().trim();
            if(option==1){
                System.out.println(solveName1(str));
            }
            else{
                System.out.println(solveName2(str));
            }
        }
    }
}
