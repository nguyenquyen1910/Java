package J05074_diemdanh1;

public class SinhVien {
    private String id,name;
    private String className;
    private DiemDanh diemDanh;
    public SinhVien(String id,String name,String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setDiemDanh(DiemDanh diemDanh) {
        this.diemDanh = diemDanh;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+diemDanh.getScore()+" "+(diemDanh.getScore()==0 ? "KDDK" : "");
    }
}
