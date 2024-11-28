package huongdandoan;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name,className,email,phone;

    public SinhVien(String id, String name, String className, String email, String phone) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.phone = solve(phone);
    }

    public String solve(String phone){
        return "0"+phone;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+email+" "+phone;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.id.compareTo(o.id);
    }
}
