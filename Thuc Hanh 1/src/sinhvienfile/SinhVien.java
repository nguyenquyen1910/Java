package sinhvienfile;

public class SinhVien implements Comparable<SinhVien> {
    private String id;
    private String name;
    private String className;
    private String email;
    private String phone;

    public SinhVien(String id, String name, String className, String email, String phone) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phone = "0"+phone;
    }

    @Override
    public int compareTo(SinhVien o) {
        if(!this.className.equals(o.className)){
            return this.className.compareTo(o.className);
        }
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+email+" "+phone;
    }
}
