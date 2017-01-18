package lab2.problem1;

public class Feature {
    private int Effort;
    private int CompletedWork;
    private int RemainingWork;
    
    public Feature() {
        Effort = 0;
        CompletedWork = 0;
        RemainingWork = 0;
    }

    public int getEffort() {
        return Effort;
    }

    public void setEffort(int Effort) {
        this.Effort = Effort;
    }
    
    public int getCompletedWork() {
        return CompletedWork;
    }

    public void setCompletedWork(int CompletedWork) {
        this.CompletedWork = CompletedWork;
    }

    public int getRemainingWork() {
        return RemainingWork;
    }

    public void setRemainingWork(int RemainingWork) {
        this.RemainingWork = RemainingWork;
    }
}
