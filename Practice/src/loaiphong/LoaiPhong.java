package loaiphong;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id, name;
    private long price;
    private double fee;

    public LoaiPhong(String info) {
        String[] tmp = info.trim().split(" ", 4);
        this.id = tmp[0];
        this.name = tmp[1];
        this.price = Long.parseLong(tmp[2]);
        this.fee = Double.parseDouble(tmp[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+price+" "+fee;
    }
}
