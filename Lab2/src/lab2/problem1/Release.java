package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Release {
    public Collection<Feature> Features;
    public Collection<Sprint> Sprints;
    
    public Release(Collection<Sprint> sprints) {
        Features = new ArrayList<>();
        Sprints = new ArrayList<>(sprints);
    }
}
