package mpp.labs.practice;

public class City {

    private final String cityName;
    private final double population;
    
    public City(String cityName, double population){
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public double getPopulation() {
        return population;
    }
}
