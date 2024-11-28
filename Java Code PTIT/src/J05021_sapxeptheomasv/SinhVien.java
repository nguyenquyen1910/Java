package J05021_sapxeptheomasv;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name,email,className;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+email;
    }


}
