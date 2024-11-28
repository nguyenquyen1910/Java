package J07047_quanlikhachsan;

public class KhachSan {
    private String id,type;
    private double price;
    private double fee;

    public KhachSan(String id, String type, double price, double fee) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.fee = fee;
    }

    public String getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }

    public double getFee() {
        return fee;
    }
}
