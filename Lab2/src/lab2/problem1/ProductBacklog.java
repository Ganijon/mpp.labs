package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class ProductBacklog {

    private Collection<Feature> Features;
    
    public ProductBacklog() {
        Features = new ArrayList<>();
    }

    public Collection<Feature> getFeatures() {
        return Features;
    }
    
    public void setFeatures(Collection<Feature> Features) {
        this.Features = Features;
    }
}
