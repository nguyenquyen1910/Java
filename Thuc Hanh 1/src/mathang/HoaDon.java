package mathang;

import java.util.Date;
import java.util.List;

public class HoaDon {
    private String id;
    private String name;
    private String phone;
    private String day;
    private List<MatHang> matHang;
    private Long totalPrice;

    public HoaDon(int i, String name, String phone, String day, List<MatHang> matHang) {
        this.name = name;
        this.id = solveId() + String.format("%03d",i+1);
        this.phone = phone;
        this.day = day;
        this.matHang = matHang;
        this.totalPrice = solveTotalPrice();
    }

    private String solveId(){
        String res="";
        String[] tmp=name.toUpperCase().split("\\s+");
        for(String x : tmp){
            res+=x.charAt(0);
        }
        return res;
    }

    private Long solveTotalPrice(){
        Long res=0L;
        for(MatHang m : matHang){
            res+=m.getQuantity()*m.getPrice();
        }
        return res;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+day+" "+totalPrice;
    }
}
