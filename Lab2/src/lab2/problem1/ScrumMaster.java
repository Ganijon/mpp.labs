package lab2.problem1;

public class ScrumMaster extends Person {

    public ScrumMaster(String name) {
        super.Name = name;
    }

    public void AssignSprintFeatureToDeveloper(Feature feature, Developer developer) {
        developer.AssignedFeatures.add(feature);
    }

    public void AddReleaseFeatureToSprint(Feature feature, Sprint sprint) {
        sprint.Features.add(feature);
    }

    public void ReportCompletedWork(Feature feature, int workUnits) {
        feature.CompletedWork = workUnits;
    }

    public void ReportRemainingWork(Feature feature, int workUnits) {
        feature.RemainingWork = workUnits;
    }
}
