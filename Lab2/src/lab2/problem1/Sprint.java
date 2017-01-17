package lab2.problem1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class Sprint {
    public LocalDate DueDate;
    public Collection<Feature> Features;
    
    public Sprint(LocalDate dueDate, Collection<Feature> features) {
        DueDate = dueDate;
        Features = new ArrayList<>(features);  
    }
}
