package J05049_lietkenhapxuathangtheonhom;

public class HangHoa implements Comparable<HangHoa> {
    private String id,group;
    private long quantity,price,profit,tax,ex;

    public HangHoa(String id, long quantity) {
        this.id = id;
        this.quantity = quantity;
        this.group=id.substring(0,1);
        this.ex=solveEx();
        this.price=solvePrice();
        this.profit=ex*price;
        this.tax=solveTax();
    }

    public long solveEx(){
        long res=0;
        if(group.equals("A")){
            res=Math.round(quantity*0.6);
        }
        else{
            res=Math.round(quantity*0.7);
        }
        return res;
    }

    public long solvePrice(){
        if(id.charAt(id.length()-1)=='Y'){
            return 110000;
        }
        return 135000;
    }

    public long solveTax(){
        long res=0;
        if(group.equals("A")){
            if(id.charAt(id.length()-1)=='Y'){
                res=Math.round(profit*0.08);
            }
            else{
                res=Math.round(profit*0.11);
            }
        }
        else{
            if(id.charAt(id.length()-1)=='Y'){
                res=Math.round(profit*0.17);
            }
            else{
                res=Math.round(profit*0.22);
            }
        }
        return res;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return id+" "+quantity+" "+ex+" "+price+" "+profit+" "+tax;
    }

    @Override
    public int compareTo(HangHoa o) {
        return Long.compare(o.tax,this.tax);
    }
}
