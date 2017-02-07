package mpp.labs.practice;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // 1. Countries should not have duplicates
        Set<Country> countries = getCountriesData();

        // 2. Print countries using forEach
        countries.stream().forEach(System.out::println);

        // 3. Grouping: HashMap<countryName, citiesCount>
        // 4. Grouping: HashMap<countryName, totalPopulation>
        // 5. Find the highlest populated city in each country
        // 6. Find the least populated city in each country
        // 7. Find whether city exist in the country
        // 8. Find the country, where the name starts with specific character
        // 9. Find the city population by city name
        // 10. Print the city and population in sorted order
        // 11. Print the city and population in reversed order
        // 12. Find the SummaryStatistic of each country
        // 13. Find the cities, where the names start with specific character 
        // 14. Find the cities, which has population > 10 million
        // 15. Group the cities with their country names by population > 10 million
        //     mapped into HashMap<CountryName, List<City>>
    }

    private static Set<Country> getCountriesData() {

        Set<Country> countries = new TreeSet<>();
        countries.add(new Country("China",
                new City("Guangzhou", 44.294_245),
                new City("Shanghai", 35.965_403),
                new City("Chongqing", 35.965_403),
                new City("Beijing", 21.500),
                new City("Hangzhou", 21.102_000),
                new City("Wuhan", 19.780_644),
                new City("Chengdu", 18),
                new City("Tianjin", 16),
                new City("Xi'an", 13.569_700),
                new City("Jinan", 13),
                new City("Nanjing", 12.652_000),
                new City("Shenyang", 12.263_612),
                new City("Harbin", 12)
        ));
        countries.add(new Country("India",
                new City("Mumbai", 12.442_373),
                new City("Delhi", 11.034_555),
                new City("Bengaluru", 8.443_675),
                new City("Hyderabad", 6.731_790),
                new City("Ahmedabad", 5.577_940),
                new City("Chennai", 4.646_732),
                new City("Kolkata", 4.496_694),
                new City("Surat", 4.467_797),
                new City("Jaipur", 3.046_163),
                new City("Lucknow", 2.817_105),
                new City("Kanpur", 2.765_348),
                new City("Nagpur", 2.405_665)
        ));
        countries.add(new Country("Japan",
                new City("Tokyo", 8.336_599),
                new City("Yokohama", 3.689_603),
                new City("Osaka", 2.666_371),
                new City("Nagoya", 2.263_907),
                new City("Sapporo", 1.883_027),
                new City("Kobe", 1.528_478),
                new City("Kyoto", 1.459_640),
                new City("Fukuoka", 1.392_289),
                new City("Kawasaki", 1.306_785),
                new City("Saitama", 1.193_350)
        ));
        countries.add(new Country("Philippines",
                new City("CALABARZON", 14.414_774),
                new City("Manila", 12.877_253),
                new City("Central Luzon", 11.218_177),
                new City("Central Visayas", 6.041_903),
                new City("Bicol", 5.796_989),
                new City("Icolos", 5.026_128),
                new City("Davao", 4.893_318),
                new City("Northern Mindanao", 4.689_302),
                new City("SOCCSKSARGEN", 4.545_276),
                new City("Western Visayas", 4.477_247),
                new City("Eastern Visayas", 4.440_150)
        ));
        countries.add(new Country("Russia",
                new City("Moscow", 11.541),
                new City("Saint Petersburg", 4.879_566),
                new City("Novosibirsk", 1.473_7541),
                new City("Nizhny Novgorod", 1.250_619),
                new City("Samara", 1.164_685),
                new City("Omsk", 1.154_116)
        ));
        countries.add(new Country("Egypt",
                new City("Cairo", 12.230_350),
                new City("Alexandria", 5.046_231),
                new City("Shubra El Kheima", 3.072_951),
                new City("Port Said", 1.607_353),
                new City("Suez", 1.347_352),
                new City("El Mahalla El Kubra", 0.838_297),
                new City("Luxor", 0.687_896)
        ));
        countries.add(new Country("Indonesia",
                new City("Jakarta", 10.187595),
                new City("Surabaya", 2.843_144),
                new City("Bandung", 2.575_478),
                new City("Medan", 2.497_183),
                new City("Bekasi", 2.510_951),
                new City("Semarang", 2.067_254),
                new City("Tangerang", 2.001_925),
                new City("Depok", 1.869_681)
        ));

        return countries;
    }

}
