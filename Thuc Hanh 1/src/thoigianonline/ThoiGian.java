package thoigianonline;

public class ThoiGian implements Comparable<ThoiGian> {
    private String name,timeBrgin,timeEnd;
    private String tSt,tEn,dateSt,dateEn;
    private long time;

    public ThoiGian(String name, String timeBrgin, String timeEnd) {
        this.name = name;
        this.timeBrgin = timeBrgin;
        this.timeEnd = timeEnd;
        this.tSt = solveTSt(timeBrgin);
        this.tEn=solveTSt(timeEnd);
        this.time=solveTime();
        this.dateSt=solveDate(timeBrgin);
        this.dateEn=solveDate(timeEnd);
    }

    public String solveTSt(String s){
        String[] tmp=s.split("\\s+");
        return tmp[1];
    }

    public String solveDate(String s){
        String[] tmp=s.split("\\s+");
        return tmp[0];
    }

    public long solveTime() {
        long res=Long.parseLong(tEn.substring(0,2))*60+Long.parseLong(tEn.substring(3,5))-Long.parseLong(tSt.substring(0,2))*60-Long.parseLong(tSt.substring(3,5));
        if(dateSt.equals(dateEn)){
            res+=24*60*(Integer.parseInt(dateEn.substring(0,2))-Integer.parseInt(dateSt.substring(0,2)));
        }
        return Long.parseLong(tEn.substring(0,2))*60+Long.parseLong(tEn.substring(3,5))-Long.parseLong(tSt.substring(0,2))*60-Long.parseLong(tSt.substring(3,5));
    }

    @Override
    public int compareTo(ThoiGian o) {
        if (this.time != o.time) {
            return Long.compare(o.time, this.time);
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name+" "+time;
    }
}
