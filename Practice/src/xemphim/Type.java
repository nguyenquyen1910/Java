package xemphim;

public class Type {
    private String typeId, typeName;

    public Type(int i, String typeName) {
        this.typeId = "TL"+String.format("%03d", i+1);
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }
}
