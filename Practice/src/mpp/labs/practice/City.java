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
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" City Name:");
        sb.append(cityName);
        sb.append(" Population:");
        sb.append(population);
        sb.append(" mln.");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        City c = (City) o;
        return c.cityName.equals(this.cityName)
                && c.population == this.population;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + cityName.hashCode();
        hash = 31 * hash + Double.hashCode(population);
        return hash;
    }
}
