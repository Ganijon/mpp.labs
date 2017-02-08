package mpp.labs.practice;

import java.util.Arrays;
import java.util.List;

public class Country implements Comparable<Country> {

    private final String name;
    private final List<City> cities;

    public Country(String name, City... cities) {
        this.name = name;
        this.cities = Arrays.asList(cities);
    }

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country:");
        sb.append(name);
        sb.append(" [");
        cities.stream().forEach((city) -> {
            sb.append("{");
            sb.append(city);
            sb.append("}, ");
        });
        sb.append("]");
        return sb.toString().replace("}, ]", "}]");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Country c = (Country) o;
        return c.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + name.hashCode();
        return hash;
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }
}
