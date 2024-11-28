package J07034_DanhSachMonHoc;

public class DanhSachMonHoc implements Comparable<DanhSachMonHoc> {
    private String id,name;
    private int soTin;

    public DanhSachMonHoc(String id, String name, int soTin) {
        this.id = id;
        this.name = name;
        this.soTin = soTin;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soTin;
    }

    @Override
    public int compareTo(DanhSachMonHoc o) {
        return this.getName().compareTo(o.name);
    }
}
