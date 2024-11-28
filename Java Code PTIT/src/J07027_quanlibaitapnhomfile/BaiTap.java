package J07027_quanlibaitapnhomfile;

public class BaiTap {
    private int id;
    private String name;

    public BaiTap(int i, String name) {
        this.id = i+1;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
