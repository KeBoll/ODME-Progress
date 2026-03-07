package behaviourtreetograph;

public class BehaviorAttribute {
    private String name;
    private String value;

    public BehaviorAttribute(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public void setValue(String pValue) {
        this.value = pValue;
    }
}
