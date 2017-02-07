package mpp.labs.practice;

import java.util.Arrays;
import java.util.List;

public class Country {

    private final String countryName;
    private final List<City> cities;

    public Country(String name, City... cities) {
        countryName = name;
        this.cities = Arrays.asList(cities);
    }

    public String getCountryName() {
        return countryName;
    }

    public List<City> getCities() {
        return cities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Name:");
        sb.append(countryName);
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
        return c.countryName.equals(this.countryName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + countryName.hashCode();
        return hash;
    }
}
