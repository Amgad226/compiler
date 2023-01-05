package nodes;

public class ObjectAssignment extends Assignment {
    public String objectId;

    public ObjectAssignment(String objectId, String id, Node value){
        super(id, value);
        this.objectId = objectId;
    }
}
