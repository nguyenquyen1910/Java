package J07045_loaiphong;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String info;
    private String id,type;
    private int price;
    private float fee;
    public LoaiPhong(String info) {
        String[] tmp=info.split("\\s+");
        this.id = tmp[0];
        this.type = tmp[1];
        this.price = Integer.parseInt(tmp[2]);
        this.fee = Float.parseFloat(tmp[3]);
    }

    @Override
    public String toString() {
        return id+" "+type+" "+price+" "+fee;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.type.compareTo(o.type);
    }
}
