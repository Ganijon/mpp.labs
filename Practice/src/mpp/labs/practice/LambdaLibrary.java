package mpp.labs.practice;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaLibrary {

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {

        R apply(T t, U u, V v);
    }

    public static Function<Stream<Country>, Map<String, Integer>> COUNTRIES_BY_NO_OF_CITIES
            = countries -> countries
                    .collect(Collectors.toMap(Country::getName, country
                            -> country.getCities().size()));

    public static Function<Stream<Country>, Map<String, Double>> COUNTRIES_BY_POPULATION
            = countries -> countries
                    .collect(Collectors.toMap(Country::getName, country
                            -> country.getCities().stream()
                            .map(City::getPopulation)
                            .reduce(0.0, Double::sum)
                    ));

    public static final Function<Country, Optional<City>> FIND_MOST_POPULOUS_CITY
            = country -> country
                    .getCities()
                    .stream()
                    .max(Comparator.comparing(City::getPopulation));

    public static final Function<Country, Optional<City>> FIND_LEAST_POPULOUS_CITY
            = country -> country
                    .getCities()
                    .stream()
                    .min(Comparator.comparing(City::getPopulation));

    public static final Function<Stream<Country>, Map<String, Optional<City>>> COUNTRIES_BY_MOST_POPULOUS_CITY
            = countries -> countries
                    .collect(Collectors.toMap(Country::getName, FIND_MOST_POPULOUS_CITY));

    public static final Function<Stream<Country>, Map<String, Optional<City>>> COUNTRIES_BY_LEAST_POPULOUS_CITY
            = countries -> countries
                    .collect(Collectors.toMap(Country::getName, FIND_LEAST_POPULOUS_CITY));

    public static final BiFunction<String, Country, Optional<City>> FIND_CITY_BY_NAME
            = (cityName, country) -> country
                    .getCities()
                    .stream()
                    .filter((city) -> city.getName().startsWith(cityName))
                    .findFirst();

    public static final TriFunction<Stream<Country>, String, String, Optional<City>> FIND_CITY_BY_COUNTRY
            = (countries, COUNTRY, CITY) -> countries
                    .filter(country -> country.getName().startsWith(COUNTRY))
                    .flatMap(country -> Stream.of(FIND_CITY_BY_NAME.apply(CITY, country)))
                    .findFirst().get();

    public static final BiFunction<Stream<Country>, Character, List<Country>> FIND_COUNTRY_BY_START_CHAR
            = (countries, CHAR) -> countries
                    .filter(c -> c.getName().startsWith(String.valueOf(CHAR)))
                    .collect(Collectors.toList());

    public static final BiFunction<Stream<Country>, String, Optional<City>> FIND_CITY_POPULATION_BY_NAME
            = (countries, CITY) -> countries
                    .map(country -> FIND_CITY_BY_NAME.apply(CITY, country))
                    .findFirst().get();

    public static final Function<Stream<Country>, List<City>> GET_CITIES_SORTED_BY_POPULATION
            = (countries) -> countries
                    .flatMap(country -> country.getCities().stream()
                    .sorted(Comparator.comparing(City::getPopulation)))
                    .collect(Collectors.toList());

    public static final Function<Stream<Country>, List<City>> GET_CITIES_SORTED_IN_REVERSE_BY_POPULATION
            = (countries) -> countries
                    .flatMap(country -> country.getCities().stream()
                    .sorted(Comparator.comparing(City::getPopulation).reversed()))
                    .collect(Collectors.toList());

    public static final Function<Stream<Country>, Map<String, DoubleSummaryStatistics>> GET_COUNTRIES_SUMMARY_STATS
            = (countries) -> countries
                    .collect(Collectors.toMap(Country::getName, country
                            -> country.getCities().stream()
                            .collect(Collectors.summarizingDouble(City::getPopulation))
                    ));

    public static final BiFunction<Stream<Country>, Character, List<City>> FIND_CITY_BY_START_CHAR
            = (countries, CHAR) -> countries
                    .flatMap(country
                            -> country.getCities().stream()
                            .filter(city -> city.getName().startsWith(String.valueOf(CHAR))))
                    .collect(Collectors.toList());

    public static final BiFunction<Stream<Country>, Double, List<City>> FIND_CITIES_BY_POPULATION_FLOOR
            = (countries, floor) -> countries
                    .flatMap(country
                            -> country.getCities().stream()
                            .filter(city -> city.getPopulation() > 10.0)
                            .sorted(Comparator.comparing(City::getPopulation).reversed())
                    )
                    .collect(Collectors.toList());

    public static final BiFunction<Stream<Country>, Double, Map<String, List<City>>> GROUP_CITIES_BY_POPULATION_FLOOR
            = (countries, floor) -> countries
                    .collect(Collectors.toMap(Country::getName, country
                            -> country.getCities().stream()
                            .filter(city -> city.getPopulation() > 10.0)
                            .sorted(Comparator.comparing(City::getPopulation).reversed())
                            .collect(Collectors.toList()))
                    );
}
