package J05076_nhapxuathang;

public class Product {
    private String id;
    private String name;
    private String rank;
    private double profitRate;

    public Product(String id, String name, String rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.profitRate = solveProfitRate();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    private double solveProfitRate() {
        if(rank.equals("A")){
            return 0.08;
        }
        if(rank.equals("B")){
            return 0.05;
        }
        return 0.02;
    }

    public double getProfitRate() {
        return profitRate;
    }
}
