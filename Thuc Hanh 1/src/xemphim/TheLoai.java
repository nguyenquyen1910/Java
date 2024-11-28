package xemphim;

public class TheLoai {
    private String id,name;

    public TheLoai(int i, String name) {
        this.id = "TL"+String.format("%03d",i+1);
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
