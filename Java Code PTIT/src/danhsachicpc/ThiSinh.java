package danhsachicpc;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id,name,team;
    private Team it;

    public ThiSinh(int i,String name, String team) {
        this.id="C"+String.format("%03d",i+1);
        this.name = name;
        this.team = team;
    }


    public Team getIt() {
        return it;
    }

    public void setIt(Team it) {
        this.it = it;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+it.getId()+" "+it.getName();
    }

    @Override
    public int compareTo(ThiSinh o) {
        return this.name.compareTo(o.name);
    }
}
