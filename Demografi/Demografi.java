import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;

public class Demografi {

    public static void main(String[] args) {
        // File file = new
        // File("/Users/alexander/Documents/JavaP/Demografi/kth.javap.demografi/demografi.1.in");
        // Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);

        try {
            int numCountries = sc.nextInt();
            Object[] countryArray = new Country[numCountries];
            Map<String, Country> countryHash = new HashMap<String, Country>();

            for (int i = 0; i < numCountries; i++) {
                String countryName = sc.next();
                countryHash.put(countryName, new Country(countryName, sc.nextInt()));
            }

            int numChange = sc.nextInt();
            for (int i = 0; i < numChange; i++) {
                String countryName = sc.next();
                // Java 8
                // countryHash.computeIfPresent(countryName, (k,v) -> v + sc.nextInt());
                countryHash.get(countryName).populationChange(sc.nextInt());
            }

            countryArray = countryHash.values().toArray();
            Arrays.sort(countryArray);
            // for(int i = 0; i < numCountries; i++) {
            // System.out.println(countryArray[i]);
            // }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        // Java 8
        // Map<String, Integer> sortedHash = new LinkedHashMap<>();
        // countryHash.entrySet().stream()
        // .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        // .forEachOrdered(x -> sortedHash.put(x.getKey(), x.getValue()));
        // sortedHash.entrySet().forEach(entry->{
        // System.out.print(entry.getKey() + " " + entry.getValue());
        // });
    }
}

class Country implements Comparable<Country> {
    private final String countryName;
    private int countryPopulation;

    public Country(String countryName, Integer countryPopulation) {
        System.out.print("hello");
        if (countryName == null || countryPopulation == null)
            throw new NullPointerException();

        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
    }

    public void populationChange(int change) {
        this.countryPopulation = this.countryPopulation + change;
    }

    public String getCountryName() {
        return countryName;
    }

    public Integer getCountryPopulation() {
        return countryPopulation;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Country)) {
            return false;
        }
        Country n = (Country) o;
        return n.countryName.equals(countryName) && n.countryPopulation == countryPopulation;
    }

    public int hashCode() {
        return 31 * countryName.hashCode() + countryPopulation;
    }

    public String toString() {
        return countryName + " " + countryPopulation;
    }

    public int compareTo(Country n) {
        // int cmp = Integer.compare(a, b); // in Java 7
        int lastCmp = Integer.compare(n.countryPopulation, countryPopulation);
        return (lastCmp != 0 ? lastCmp : countryName.compareTo(n.countryName));
    }
}
