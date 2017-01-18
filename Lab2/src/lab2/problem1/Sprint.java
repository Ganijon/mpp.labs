package lab2.problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Sprint {
    private LocalDate DueDate;
    private Collection<Feature> Features;
    
    public Sprint(LocalDate dueDate, Collection<Feature> features) {
        DueDate = dueDate;
        Features = new ArrayList<>(features);  
    }

    public LocalDate getDueDate() {
        return DueDate;
    }

    public void setDueDate(LocalDate DueDate) {
        this.DueDate = DueDate;
    }

    public Collection<Feature> getFeatures() {
        return Features;
    }

    public void setFeatures(Collection<Feature> Features) {
        this.Features = Features;
    }
}
