package J05048_bangtheodoixuatnhaphang;

public class Invoice {
    private String id;
    private Long importQuantity;
    private Long exportQuantity;
    private Long price;
    private Long totalAmount;
    private Long taxAmount;

    public Invoice(String id, Long importQuantity) {
        this.id = id;
        this.importQuantity = importQuantity;
        this.exportQuantity = solveExportQuantity();
        this.price = solvePrice();
        this.totalAmount = solveTotalAmount();
        this.taxAmount = solveTaxAmount();
    }

    private Long solveExportQuantity() {
        if(id.substring(0,1).equals("A")){
            return Math.round(importQuantity * 0.6);
        }
        return Math.round(importQuantity * 0.7);
    }

    private Long solvePrice(){
        if(id.substring(id.length()-1, id.length()).equals("Y")){
            return 110000L;
        }
        return 135000L;
    }

    private Long solveTotalAmount(){
        return exportQuantity * price;
    }

    private Long solveTaxAmount(){
        if(id.substring(0,1).equals("A")) {
            if(id.substring(id.length()-1, id.length()).equals("Y")){
                return Math.round(totalAmount * 0.08);
            }
            else{
                return Math.round(totalAmount * 0.11);
            }
        }
        else{
            if(id.substring(id.length()-1, id.length()).equals("Y")){
                return Math.round(totalAmount * 0.17);
            }
            else{
                return Math.round(totalAmount * 0.22);
            }
        }
    }

    @Override
    public String toString() {
        return id+" "+importQuantity+" "+exportQuantity+" "+price+" "+totalAmount+" "+taxAmount;
    }
}
