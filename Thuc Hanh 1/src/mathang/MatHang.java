package mathang;


public class MatHang {
    private String name;
    private int quantity;
    private int price;

    public MatHang(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
