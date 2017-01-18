package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Developer extends Person {
    
    private Collection<Feature> AssignedFeatures;
    
    public Developer(String name) {
        super.Name = name;
        AssignedFeatures = new ArrayList<>();
    }
    
    public void EstimateEffort(Feature feature, int effort){
        feature.setEffort(effort);
    }

    public Collection<Feature> getAssignedFeatures() {
        return AssignedFeatures;
    }

    public void setAssignedFeatures(Collection<Feature> AssignedFeatures) {
        this.AssignedFeatures = AssignedFeatures;
    }
}
