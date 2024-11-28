package J05050_tinhtiendien;

public class ElectronicUsed {
    private String maKH;
    private String heSo;
    private int heSoNhan;
    private int chiSoCu;
    private int chiSoMoi;
    private int thanhTien;
    private int phuTroi;
    private int tongTien;

    public ElectronicUsed(int i,String heSo, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH"+String.format("%02d",i+1);
        this.heSo = heSo;
        this.heSoNhan=solveHeSoNhan();
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.thanhTien = (chiSoMoi-chiSoCu)*this.heSoNhan*550;
        this.phuTroi = solvePhuTroi();
        this.tongTien = this.thanhTien+this.phuTroi;
    }

    public int solveHeSoNhan(){
        int res=0;
        if(heSo.equals("KD")){
            res=3;
        }
        else if(heSo.equals("NN")){
            res=5;
        }
        else if(heSo.equals("TT")){
            res=4;
        }
        else{
            res=2;
        }
        return res;
    }

    public int solvePhuTroi(){
        int res=0;
        if(chiSoMoi-chiSoCu<50){
            res=0;
        }
        else if(50<=chiSoMoi-chiSoCu && chiSoMoi-chiSoCu<=100){
            res=Math.round(thanhTien*0.35f);
        }
        else{
            res=thanhTien;
        }
        return res;
    }

    @Override
    public String toString() {
        return maKH + " " + heSoNhan + " " + thanhTien + " " + phuTroi + " " + tongTien;
    }
}
