package behaviourtreetograph;

import java.util.ArrayList;
import java.util.List;

public class BehaviorAttributeOverview {
    private String behaviorName;
    private List<behaviourtreetograph.BehaviorAttribute> attributes = new ArrayList<>();

    public BehaviorAttributeOverview(String name) {
        this.behaviorName = name;
    }

    public String getBehaviorName() {
        return behaviorName;
    }

    public void addAttribute(behaviourtreetograph.BehaviorAttribute addedAttribute) {
        attributes.add(addedAttribute);
    }

    public List<behaviourtreetograph.BehaviorAttribute> getAttributes() {
        return attributes;
    }
}
