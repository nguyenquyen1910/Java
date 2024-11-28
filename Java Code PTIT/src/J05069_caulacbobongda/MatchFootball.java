package J05069_caulacbobongda;

public class MatchFootball {
    private String id;
    private int audis;
    private FootballClub footballClub;

    public MatchFootball(String id, int audis, FootballClub footballClub) {
        this.id = id;
        this.audis = audis;
        this.footballClub = footballClub;
    }

    public String getId() {
        return id;
    }

    public String getClub(){
        return footballClub.getName();
    }

    public int revenue(){
        return audis*footballClub.getPrice();
    }


    @Override
    public String toString() {
        return id+" "+getClub()+" "+revenue();
    }
}
