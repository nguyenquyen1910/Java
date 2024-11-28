package J05009_thukhoakithi;

public class ThiSinh implements Comparable<ThiSinh> {
    private String ten,ns;
    private int id;
    private Float sc1,sc2,sc3,total;

    public ThiSinh(int i, String ten, String ns, Float sc1, Float sc2, Float sc3) {
        this.id = i+1;
        this.ten = ten;
        this.ns = ns;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
        this.total = sc1+sc2+sc3;
    }

    public Float getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return id+" "+ten+" "+ns+" "+String.format("%.1f",total);
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(Float.compare(this.total,o.total)!=0){
            return Float.compare(o.total,this.total);
        }
        return this.id-o.id;
    }
}
