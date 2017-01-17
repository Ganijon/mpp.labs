package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Project {
    public ProductBacklog Backlog;
    public Collection<Release> Releases;
    
    public Project(Collection<Release> releases) {
        Backlog = new ProductBacklog();
        Releases = new ArrayList<>(releases);
    }
}
