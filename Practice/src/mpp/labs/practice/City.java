package mpp.labs.practice;

public class City {

    private final String name;
    private final double population;

    public City(String cityName, double population) {
        this.name = cityName;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("City:");
        sb.append(name.trim());
        sb.append(" Population:");
        sb.append(population);
        sb.append("m");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        City c = (City) o;
        return c.name.equals(this.name)
                && c.population == this.population;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + name.hashCode();
        hash = 31 * hash + Double.hashCode(population);
        return hash;
    }
}
