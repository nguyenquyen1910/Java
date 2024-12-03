import java.util.*;
import java.io.*;
import java.text.*;

public class test {
    static String cleanName(String name){
        String[] a = name.trim().split("\\s+");
        for(int i=0;i<a.length;i++) a[i] = Character.toString(a[i].charAt(0)).toUpperCase() + a[i].substring(1).toLowerCase();
        return String.join(" ", a);
    }

    static class MH{
        String code, name, tc;
        public MH(String code, String name, String tc){
            this.code = code;
            this.name = name;
            this.tc = tc;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    static class SV{
        String code, name, cl, mail;
        public SV(String code, String name, String cl, String mail){
            this.code = code;
            this.name = cleanName(name);
            this.cl = cl;
            this.mail = mail;
        }
    }

    static class BD{
        MH mh;
        SV sv;
        String point;
        Double Point;

        public BD(SV sv, MH mh, String point){
            this.mh = mh;
            this.sv = sv;
            this.point = point;
            this.Point = Double.parseDouble(point);
        }

        @Override
        public String toString(){
            return sv.code + " " + sv.name + " " + sv.cl + " " + point;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc_sv = new Scanner(System.in);
        HashMap<String, SV> hsv = new HashMap<>();
        HashMap<String, MH> hmh = new HashMap<>();
        int nsv = sc_sv.nextInt();
        sc_sv.nextLine();
        for(int i=0;i<nsv;i++){
            SV x = new SV(sc_sv.nextLine(), sc_sv.nextLine(), sc_sv.nextLine(), sc_sv.nextLine());
            hsv.put(x.code, x);
        }
        int nmh = sc_sv.nextInt();
        sc_sv.nextLine();
        for(int i=0;i<nmh;i++){
            MH x = new MH(sc_sv.nextLine(), sc_sv.nextLine(), sc_sv.nextLine());
            hmh.put(x.code, x);
        }
        int nbd = sc_sv.nextInt();
        ArrayList<BD> a = new ArrayList<>();
        for(int i=0;i<nbd;i++){
            a.add(new BD(hsv.get(sc_sv.next()), hmh.get(sc_sv.next()), sc_sv.next()));
        }
        a.sort((BD x, BD y) -> {
            if(x.Point == y.Point) return x.sv.code.compareTo(y.sv.code);
            return y.Point.compareTo(x.Point);
        });
        int q = sc_sv.nextInt();
        while(q-->0){
            String code = sc_sv.next();
            System.out.printf("BANG DIEM MON %s:\n", hmh.get(code));
            a.forEach(e -> {
                if(e.mh.code.compareTo(code) == 0) System.out.println(e);
            });
        }
    }
}