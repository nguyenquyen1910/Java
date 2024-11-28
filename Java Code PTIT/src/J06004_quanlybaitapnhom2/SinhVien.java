package J06004_quanlybaitapnhom2;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name,phone;
    private int exId;
    private BaiTapNhom baiTapNhom;

    public SinhVien(String id, String name, String phone, int exId) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.exId = exId;

    }

    public int getExId(){
        return exId;
    }

    public BaiTapNhom getBaiTapNhom() {
        return baiTapNhom;
    }

    public void setBaiTapNhom(BaiTapNhom baiTapNhom) {
        this.baiTapNhom = baiTapNhom;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+phone+" "+exId+" "+baiTapNhom.getName();
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
}
