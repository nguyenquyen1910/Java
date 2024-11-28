package J05022_lietketheolop;

public class SinhVien {
    private String id,name,email,className;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+className+" "+email;
    }
}
