package J06007_bangtinhgio;

public class Subject {
    private String info,id,name;

    public Subject(String info) {
        this.info=info;
        this.id = info.substring(0,7);
        this.name = info.substring(8);
    }

    public String getId() {
        return id;
    }

}
