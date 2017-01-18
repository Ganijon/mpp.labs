package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Release {
    private Collection<Feature> Features;
    private Collection<Sprint> Sprints;
    
    public Release(Collection<Sprint> sprints) {
        Features = new ArrayList<>();
        Sprints = new ArrayList<>(sprints);
    }

    public Collection<Feature> getFeatures() {
        return Features;
    }

    public void setFeatures(Collection<Feature> Features) {
        this.Features = Features;
    }

    public Collection<Sprint> getSprints() {
        return Sprints;
    }

    public void setSprints(Collection<Sprint> Sprints) {
        this.Sprints = Sprints;
    }
}
