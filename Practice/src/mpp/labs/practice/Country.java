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
}
