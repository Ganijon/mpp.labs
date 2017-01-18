package lab3.problem1;

public class PersonWithJob { // no generalization/inheritance

    private Person person; // aggregation association
    private double salary;

    public double getSalary() {
        return salary;
    }

    PersonWithJob(String name, double salary) {
        person = new Person(name);
        this.salary = salary;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) {
            return false;
        }
        if (!(aPerson.getClass().equals(PersonWithJob.class))) {
            return false;
        }
        PersonWithJob p = (PersonWithJob) aPerson;
        boolean isEqual = this.person.getName().equals(p.person.getName())
                && this.getSalary() == p.getSalary();
        return isEqual;
    }
}
