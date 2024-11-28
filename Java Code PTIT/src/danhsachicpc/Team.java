package danhsachicpc;

public class Team {
    private String cnt,id,name;
    public Team(int i,String id, String name) {
        this.cnt="Team"+String.format("%02d",i+1);
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCnt(){
        return cnt;
    }
}
