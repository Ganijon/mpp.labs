package lab2.problem1;

public class ScrumMaster extends Person {

    public ScrumMaster(String name) {
        super.Name = name;
    }

    public void AssignSprintFeatureToDeveloper(Feature feature, Developer developer) {
        developer.getAssignedFeatures().add(feature);
    }

    public void AddReleaseFeatureToSprint(Feature feature, Sprint sprint) {
        sprint.getFeatures().add(feature);
    }

    public void ReportCompletedWork(Feature feature, int workUnits) {
        feature.setCompletedWork(workUnits);
    }

    public void ReportRemainingWork(Feature feature, int workUnits) {
        feature.setRemainingWork(workUnits);
    }
}
