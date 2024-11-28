package J05070_caulabobongda2;

public class FootballClub {
    private String id,name;
    private int price;

    public FootballClub(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
