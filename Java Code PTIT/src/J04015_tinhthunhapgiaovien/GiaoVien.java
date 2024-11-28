package J04015_tinhthunhapgiaovien;

public class GiaoVien {
    private String id;
    private String name;
    private int salary;
    private int step;
    private int support;
    private int total;

    public GiaoVien(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.step=Integer.parseInt(id.substring(2));
        this.support = solveSupport();
        this.total = salary*this.step+this.support;
    }

    public int solveSupport(){
        int res=0;
        String tmp=id.substring(0,2);
        if(tmp.equals("HT")){
            res=2000000;
        }
        else if(tmp.equals("HP")){
            res=900000;
        }
        else res=500000;
        return res;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+step+" "+support+" "+total;
    }
}
