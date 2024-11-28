package J06005_quanlibanhang;

public class Product {
    private String proId,proName,proUnit;
    private int proBuy,proSell;

    public Product(int i, String proName, String proUnit, int proBuy, int proSell) {
        this.proId = "MH"+String.format("%03d",i+1);
        this.proName = proName;
        this.proUnit = proUnit;
        this.proBuy = proBuy;
        this.proSell = proSell;
    }

    public String getProId() {
        return proId;
    }

    public String getProName() {
        return proName;
    }

    public String getProUnit() {
        return proUnit;
    }

    public int getProBuy() {
        return proBuy;
    }

    public int getProSell() {
        return proSell;
    }
}
