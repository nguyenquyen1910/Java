package J05051_sapxeptinhtiendien;

public class Information implements Comparable<Information> {
    private String id;
    private String type;
    private Integer oldNumber;
    private Integer newNumber;
    private Integer coefficient;
    private Long price;
    private Long fee;
    private Long totalAmount;

    public Information(int i,String type, Integer oldNumber, Integer newNumber) {
        this.id = "KH" + String.format("%02d", i+1);
        this.type = type;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.coefficient = solveCoefficient();
        this.price = (newNumber-oldNumber) * 550L * this.coefficient;
        this.fee = solveFee();
        this.totalAmount = this.price + this.fee;
    }

    private Integer solveCoefficient() {
        if(type.equals("KD")){
            return 3;
        }
        else if(type.equals("NN")){
            return 5;
        }
        else if(type.equals("TT")){
            return 4;
        }
        return 2;
    }

    private Long solveFee() {
        if(newNumber-oldNumber < 50){
            return 0L;
        }
        else if(50 <= newNumber-oldNumber && newNumber-oldNumber <= 100){
            return (long) Math.ceil(price * 0.35);
        }
        return price;
    }

    @Override
    public String toString() {
        return id+" "+coefficient+" "+price+" "+fee+" "+totalAmount;
    }

    @Override
    public int compareTo(Information o) {
        return Long.compare(o.totalAmount, this.totalAmount);
    }
}
