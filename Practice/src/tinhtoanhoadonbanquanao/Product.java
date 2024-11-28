package tinhtoanhoadonbanquanao;

public class Product {
    private String proId;
    private String proName;
    private long proPrice1;
    private long proPrice2;

    public Product(String proId, String proName, long proPrice1, long proPrice2) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice1 = proPrice1;
        this.proPrice2 = proPrice2;
    }

    public String getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public long getProPrice1() {
        return proPrice1;
    }

    public long getProPrice2() {
        return proPrice2;
    }
}
