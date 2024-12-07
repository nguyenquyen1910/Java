package tenviettat;

public class HoTen implements Comparable<HoTen> {
    private String hoTen;
    private String ho;
    private String ten;
    private String tvt;

    public HoTen(String hoTen) {
        this.hoTen = hoTen;
        String[] tmp = hoTen.trim().split("\\s+");
        this.ho = tmp[0];
        this.ten = tmp[tmp.length - 1];
        this.tvt = solveTvt();
    }

    private String solveTvt() {
        String res = "";
        String[] tmp = hoTen.trim().split("\\s+");
        for(String it : tmp){
            res += it.toUpperCase().charAt(0)+".";
        }
        return res.substring(0,res.length()-1);
    }

    public boolean compare(String s){
        if(s.length()!=tvt.length()) return false;
        for(int i=0;i<tvt.length();i++){
            if(s.charAt(i)=='*') continue;
            if(s.charAt(i)!=tvt.charAt(i)) return false;
        }
        return true;
    }

    @Override
    public int compareTo(HoTen o) {
        if(!this.ten.equals(o.ten)){
            return this.ten.compareTo(o.ten);
        }
        return this.ho.compareTo(o.ho);
    }

    @Override
    public String toString() {
        return hoTen;
    }
}
