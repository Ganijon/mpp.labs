package lab2.problem1;

import java.util.ArrayList;
import java.util.Collection;

public class Project {
    private ProductBacklog Backlog;
    private Collection<Release> Releases;
    
    public Project(Collection<Release> releases) {
        Backlog = new ProductBacklog();
        Releases = new ArrayList<>(releases);
    }

    public ProductBacklog getBacklog() {
        return Backlog;
    }

    public void setBacklog(ProductBacklog Backlog) {
        this.Backlog = Backlog;
    }

    public Collection<Release> getReleases() {
        return Releases;
    }

    public void setReleases(Collection<Release> Releases) {
        this.Releases = Releases;
    }
}
