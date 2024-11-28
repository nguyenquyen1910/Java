//Xau ki tu o java khong the thay doi duoc ki tu

import java.util.Scanner;
import java.util.StringTokenizer;

public class basic {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(s.length());

        //Duyet qua cac ki tu
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println("");

        //Noi 2 xau
        String t="bcdh";
        s=s.concat(t);
        System.out.println(s);

        //Chuyen xau s thanh dang in thuong(in hoa)
        String newS=s.toUpperCase();
        String new1S=s.toLowerCase();
        System.out.println(newS);
        String newT="  ab c  ";
        newT=newT.trim();//Loai bo cac dau cach thua o dau cuoi
        System.out.println(newT);

        //So sanh noi dung 2 xau
        System.out.println(s.equals(t));//Tra ve true/false
        String x1="ABC";
        String x2="ABC";

        // == : so sanh object
        if(x1==x2){
            System.out.println("YES");
        }

        //Vi du 1 truong hop khac
        String s1=new String("abc");
        String s2=new String("abc");
        if(s1==s2){
            System.out.println("YES");
        }
        else System.out.println("NO");

        //Ham compare
        System.out.println(x1.compareTo(x2));
        //Ham so sanh nhung khong xet den tinh chat in hoa in thuong
        System.out.println(x1.compareToIgnoreCase(x2));


        //Ham cat xau
        String x11="123456789123";
        String x12="123";
        String new_x11=x11.substring(0,5);
        System.out.println(new_x11);

        //Ham check 1 xau nam trong 1 xau khac hay khong
        System.out.println(x12.contains(x11));

        //Ham relpace(thay the 2 xau)
        x11=x11.replace("12", "acb");
        System.out.println(x11);


        //Doc xau tu ban phim
        Scanner sc = new Scanner(System.in);
        // String s11=sc.next();
        // System.out.println(s11);
        // sc.nextLine();//Xu ly dau enter thua
        String t11=sc.nextLine();
        //System.out.println(t11);

        //Nhap 1 char
        // char c11=sc.nextLine().charAt(0);
        // System.out.println(c11);

        //Ham tach cac tu
        String[] arr=t11.split("\\s+");//Tach theo dau cach
        // for(String x : arr){
        //     System.out.println(x);
        // }
        StringBuilder stringBuilder = new StringBuilder(t11);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);//Xoa ki tu cuoi cung
        System.out.println(stringBuilder.toString());

        //Them ki tu vao xau
        stringBuilder.append(" dang hoc lap trinh");
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.reverse().toString());


        //StringTokenizer(tach thanh cac token)
        StringTokenizer st = new StringTokenizer("Nguyen Van A");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        //Chuyen noi dung 1 xau thanh 1 so
        String numToString="12345";
        int n=Integer.parseInt(numToString);
        System.out.println(n);
        //Chuyen so thanh xau
        String newnum=""+numToString;
        System.out.println(newnum);

        //Kiem tra cac ki tu
        String checkString="123445asvdAvv";
        System.out.println(Character.isDigit(0));
        //...
    }
}
