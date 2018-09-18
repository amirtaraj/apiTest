package pojo;

public class RelationTypes {

    private String RelationCode;

    public RelationTypes() {

    }

    public RelationTypes(String relationCode) {
        RelationCode = relationCode;
    }

    public String getRelationCode() {
        return RelationCode;
    }

    public void setRelationCode(String relationCode) {
        this.RelationCode = relationCode;
    }

    @Override
    public String toString() {
        return "RelationTypes{" +
                "RelationCode='" + RelationCode + '\'' +
                '}';
    }
}
