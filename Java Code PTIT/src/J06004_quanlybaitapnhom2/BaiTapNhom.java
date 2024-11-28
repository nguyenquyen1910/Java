package J06004_quanlybaitapnhom2;

public class BaiTapNhom {
    private int id;
    private String name;

    public BaiTapNhom(int i, String name) {
        this.id = i+1;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
