package J05078_bangluongtheophongban;

public class PhongBan {
    private String info,id,name;

    public PhongBan(String info) {
        this.info = info;
        this.id=solveId();
        this.name=solveName();
    }

    public String solveId(){
        String[] tmp=info.split("\\s+");
        return tmp[0];
    }
        
    public String solveName(){
        String[] tmp=info.split("\\s+");
        String res="";
        for(int i=1;i<tmp.length;i++){
            res+=tmp[i]+" ";
        }
        return res.trim();
    }
    
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
}
