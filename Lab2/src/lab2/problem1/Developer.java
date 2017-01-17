package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Developer extends Person {
    
    Collection<Feature> AssignedFeatures;
    
    public Developer(String name) {
        super.Name = name;
        AssignedFeatures = new ArrayList<>();
    }
    
    public void EstimateEffort(Feature feature, int effort){
        feature.Effort = effort;
    }
}
