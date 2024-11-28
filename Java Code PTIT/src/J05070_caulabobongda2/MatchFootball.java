package J05070_caulabobongda2;

public class MatchFootball implements Comparable<MatchFootball> {
    private String id;
    private int audis,revenue;
    private FootballClub footballClub;

    public MatchFootball(String id, int audis, FootballClub footballClub) {
        this.id = id;
        this.audis = audis;
        this.footballClub = footballClub;
        this.revenue=audis*footballClub.getPrice();
    }

    public String getId() {
        return id;
    }

    public String getClub(){
        return footballClub.getName();
    }

    @Override
    public String toString() {
        return id+" "+getClub()+" "+revenue;
    }

    @Override
    public int compareTo(MatchFootball o) {
        if(this.revenue!=o.revenue){
            return o.revenue-this.revenue;
        }
        return this.getClub().compareTo(o.getClub());
    }
}
