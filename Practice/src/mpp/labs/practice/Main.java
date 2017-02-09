package mpp.labs.practice;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {

    private static final Supplier<Stream<Country>> STREAM
            = () -> DataProvider.GetCountryData().stream();

    private static void printTask(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        printTask("1. Print all data");

        STREAM.get().forEach(System.out::println);

        printTask("2. Print countries using forEach");

        STREAM.get()
                .forEach(country -> {
                    System.out.println("@" + country.getName());
                    country.getCities()
                            .stream()
                            .forEach(city -> System.out.printf(" %s%.3fm\n",
                            city.getName(), city.getPopulation()));
                });

        printTask("3. Grouping: HashMap<countryName, citiesCount>");

        LambdaLibrary.COUNTRIES_BY_NO_OF_CITIES.apply(STREAM.get())
                .forEach((country, cities)
                        -> System.out.printf(" %s%s\n", country, cities));

        printTask("4. Grouping: HashMap<countryName, totalPopulation>");

        LambdaLibrary.COUNTRIES_BY_POPULATION.apply(STREAM.get())
                .forEach((country, population)
                        -> System.out.printf(" %s%.2fm\n", country, population));

        printTask("5. Find the highlest populated city in each country");

        LambdaLibrary.COUNTRIES_BY_MOST_POPULOUS_CITY.apply(STREAM.get())
                .forEach((country, cityOpt) -> {
                    cityOpt.ifPresent(city -> System.out.printf(" %s%s%.1fm\n",
                            country, city.getName(), city.getPopulation()));
                });

        printTask("6. Find the least populated city in each country");

        LambdaLibrary.COUNTRIES_BY_LEAST_POPULOUS_CITY.apply(STREAM.get())
                .forEach((country, cityOpt) -> {
                    cityOpt.ifPresent(city -> System.out.printf(" %s%s%.1fm\n",
                            country, city.getName(), city.getPopulation()));
                });

        printTask("7. Find whether city exist in the country ");

        LambdaLibrary.FIND_CITY_BY_COUNTRY.apply(STREAM.get(), "Russia", "Moscow")
                .ifPresent(city -> System.out.printf(" Found: %s in %s\n",
                city.getName(), "Russia"));

        printTask("8. Find the country, where the name starts with specific character");

        LambdaLibrary.FIND_COUNTRY_BY_START_CHAR.apply(STREAM.get(), 'C')
                .forEach(c -> System.out.printf(" Found: %s\n", c.getName()));

        printTask("9. Find the city population by city name");

        LambdaLibrary.FIND_CITY_POPULATION_BY_NAME.apply(STREAM.get(), "Suez")
                .ifPresent(city -> System.out.printf(" Found: %s %.2fm\n",
                city.getName(), city.getPopulation()));

        printTask("10.Print the city and population in sorted order");

        LambdaLibrary.GET_CITIES_SORTED_BY_POPULATION.apply(STREAM.get())
                .forEach(city -> System.out.printf("  %s%.3fm\n",
                city.getName(), city.getPopulation()));

        printTask("11. Print the city and population in reversed order");

        LambdaLibrary.GET_CITIES_SORTED_IN_REVERSE_BY_POPULATION.apply(STREAM.get())
                .forEach(city -> System.out.printf("  %s%.3fm\n",
                city.getName(), city.getPopulation()));

        printTask("12.Find the Summary Statistic of each country");

        LambdaLibrary.GET_COUNTRIES_SUMMARY_STATS
                .apply(STREAM.get())
                .forEach((country, stats)
                        -> System.out.printf(" %s%s\n", country, stats));

        printTask("13. Find the cities, where the names start with specific character");

        LambdaLibrary.FIND_CITY_BY_START_CHAR.apply(STREAM.get(), 'T')
                .forEach(city
                        -> System.out.printf(" %s%.4fm\n", city.getName(), city.getPopulation()));

        printTask("14. Find the cities, which has population > 10 million");

        LambdaLibrary.FIND_CITIES_BY_POPULATION_FLOOR.apply(STREAM.get(), 10.0)
                .forEach(city
                        -> System.out.printf(" %s%.4fm\n", city.getName(), city.getPopulation()));

        printTask("15. Group the cities with their country names by population > 10 million "
                + "mapped into HashMap<CountryName, List<City>>");

        LambdaLibrary.GROUP_CITIES_BY_POPULATION_FLOOR.apply(STREAM.get(), 10.0)
                .forEach((country, cities) -> {
                    System.out.println("@" + country);
                    cities.forEach(city -> {
                        System.out.printf("  %s%s\n", city.getName(), city.getPopulation());
                    });
                });

    }
}
