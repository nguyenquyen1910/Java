package J07056_tinhtiendien;

public class KhachHang implements Comparable<KhachHang> {
    private String id;
    private String name;
    private String typeElec;
    private int startNum;
    private int endNum;
    private long limit;
    private long limitPrice;
    private long noLimitPrice;
    private long vatPrice;
    private long totalPrice;

    public KhachHang(int i, String name, String typeElec, int startNum, int endNum) {
        this.id = "KH" + String.format("%02d", i+1);
        this.name = name;
        this.typeElec = typeElec;
        this.startNum = startNum;
        this.endNum = endNum;
        this.limit = solveLimit();
        this.limitPrice = solveLimitPrice();
        this.noLimitPrice = solveNoLimitPrice();
        this.vatPrice = solveVatPrice();
        this.totalPrice = solveTotalPrice();
    }

    public long solveLimit(){
        if(typeElec.equals("A")){
            return 100;
        }
        else if(typeElec.equals("B")){
            return 500;
        }
        return 200;
    }

    public long solveLimitPrice() {
        long res=0;
        if((endNum - startNum) < limit){
            res = (endNum - startNum) * 450;
        }
        else if((endNum - startNum) > limit){
            res = limit * 450;
        }
        return res;
    }

    public long solveNoLimitPrice() {
        long res=0;
        if((endNum - startNum) > limit){
            res = ((endNum - startNum) - limit) * 1000;
        }
        return res;
    }

    public long solveVatPrice() {
        return (long) (0.05 * noLimitPrice);
    }

    public long solveTotalPrice() {
        return limitPrice + noLimitPrice + vatPrice;
    }

    @Override
    public int compareTo(KhachHang o) {
        return Long.compare(o.totalPrice, this.totalPrice);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+limitPrice+" "+noLimitPrice+" "+vatPrice+" "+totalPrice;
    }
}
