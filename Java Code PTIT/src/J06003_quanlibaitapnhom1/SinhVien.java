package J06003_quanlibaitapnhom1;

public class SinhVien {
    private String id,name,phone;
    private int group;

    public SinhVien(String id, String name, String phone, int group) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group = group;
    }
    public int getGroup(){
        return group;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+phone;
    }
}
