package J05071_tinhcuocdienthoaicodinh;

public class Province {
    private String proId;
    private String proName;
    private long proPrice;

    public Province(String proId, String proName, long proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }

    public String getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public long getProPrice() {
        return proPrice;
    }
}
