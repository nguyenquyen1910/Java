package J07027_quanlibaitapnhomfile;

public class SinhVien {
    private String id;
    private String name;
    private String phone;

    public SinhVien(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
