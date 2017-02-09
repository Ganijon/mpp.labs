package mpp.labs.practice;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    static final Consumer<Object> printer = System.err::println;

    public static void main(String[] args) {

        printer.accept("2. Print countries using forEach");
        Data.COUNTRIES.get()
                .forEach(country -> {
                    System.err.println(country.getName());
                    country.getCities()
                            .stream()
                            .forEach(city -> System.out.printf(" %s%.3fm\n",
                            city.getName(), city.getPopulation())
                            );
                });

        printer.accept("3. Grouping: HashMap<countryName, citiesCount>");

        LambdaLibrary.COUNTRIES_BY_NO_OF_CITIES
                .apply(Data.COUNTRIES.get())
                .forEach((country, cities)
                        -> System.out.printf(" %s%s\n", country, cities));

        printer.accept("4. Grouping: HashMap<countryName, totalPopulation>");

        LambdaLibrary.COUNTRIES_BY_POPULATION
                .apply(Data.COUNTRIES.get())
                .forEach((country, population)
                        -> System.out.printf(" %s%.2fm\n", country, population));

        printer.accept("5. Find the highlest populated city in each country");

        LambdaLibrary.COUNTRIES_BY_MOST_POPULOUS_CITY
                .apply(Data.COUNTRIES.get())
                .forEach((country, cityOpt) -> {
                    cityOpt.ifPresent(city -> System.out.printf(" %s%s%.1fm\n",
                            country, city.getName(), city.getPopulation()));
                });

        printer.accept("6. Find the least populated city in each country");

        LambdaLibrary.COUNTRIES_BY_LEAST_POPULOUS_CITY
                .apply(Data.COUNTRIES.get())
                .forEach((country, cityOpt) -> {
                    cityOpt.ifPresent(city -> System.out.printf(" %s%s%.1fm\n",
                            country, city.getName(), city.getPopulation()));
                });

        printer.accept("7. Find whether city exist in the country ");

        LambdaLibrary.FIND_CITY_BY_COUNTRY
                .apply(Data.COUNTRIES.get(), "Russia", "Moscow")
                .ifPresent(city -> System.out.printf(" Found: %s in %s\n",
                city.getName(), "Russia"));

        printer.accept("8. Find the country, where the name starts with specific character");

        LambdaLibrary.FIND_COUNTRY_BY_START_CHAR
                .apply(Data.COUNTRIES.get(), 'C')
                .forEach(c -> System.out.printf(" Found: %s\n", c.getName()));

        printer.accept("9. Find the city population by city name");

        LambdaLibrary.FIND_CITY_POPULATION_BY_NAME
                .apply(Data.COUNTRIES.get(), "Suez")
                .ifPresent(city -> System.out.printf(" Found: %s %.2fm\n",
                city.getName(), city.getPopulation()));

        printer.accept("10.Print the city and population in sorted order");

        LambdaLibrary.GET_CITIES_SORTED_BY_POPULATION
                .apply(Data.COUNTRIES.get())
                .forEach(city -> System.out.printf("  %s%.3fm\n",
                city.getName(), city.getPopulation()));

        printer.accept("11. Print the city and population in reversed order");
        
        LambdaLibrary.GET_CITIES_SORTED_IN_REVERSE_BY_POPULATION
                .apply(Data.COUNTRIES.get())
                .forEach(city -> System.out.printf("  %s%.3fm\n",
                city.getName(), city.getPopulation()));

        printer.accept("12.Find the Summary Statistic of each country");
        Data.COUNTRIES.get()
                .collect(Collectors.toMap(Country::getName, country
                        -> country.getCities().stream()
                        .collect(Collectors.summarizingDouble(City::getPopulation))
                ))
                .forEach((country, stats)
                        -> System.out.printf(" %s%s\n", country, stats));

        printer.accept("13. Find the cities, where the names start with specific character");
        char CHAR2 = 'A';
        Data.COUNTRIES.get()
                .flatMap(country
                        -> country.getCities().stream()
                        .filter(city -> city.getName().startsWith(String.valueOf(CHAR2))))
                .forEach(city
                        -> System.out.printf(" %s%.4fm\n", city.getName(), city.getPopulation()));

        printer.accept("14. Find the cities, which has population > 10 million");
        Data.COUNTRIES.get()
                .flatMap(country
                        -> country.getCities().stream()
                        .filter(city -> city.getPopulation() > 10.0)
                        .sorted(Comparator.comparing(City::getPopulation).reversed())
                )
                .forEach(city
                        -> System.out.printf(" %s%.4fm\n", city.getName(), city.getPopulation()));

        printer.accept("15. Group the cities with their country names by population > 10 million "
                + "mapped into HashMap<CountryName, List<City>>");
        Data.COUNTRIES.get()
                .collect(Collectors.toMap(Country::getName, country
                        -> country.getCities().stream()
                        .filter(city -> city.getPopulation() > 10.0)
                        .sorted(Comparator.comparing(City::getPopulation).reversed())
                        .collect(Collectors.toList()))
                )
                .forEach((country, cities) -> {
                    System.err.println(country);
                    cities.forEach(city -> {
                        System.out.printf("  %s%s\n", city.getName(), city.getPopulation());
                    });
                });

    }
}
