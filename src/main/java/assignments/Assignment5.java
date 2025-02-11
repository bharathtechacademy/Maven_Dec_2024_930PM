package assignments;

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
    	
        // 1. Create a list of the top 5 most populated countries in the world and print the 2nd country
        List<String> populatedCountries = new ArrayList<String>();
        populatedCountries.add("India");
        populatedCountries.add("China");
        populatedCountries.add("United States");
        populatedCountries.add("Indonesia");
        populatedCountries.add("Canada");
        System.out.println("2nd Most Populated Country: " + populatedCountries.get(1));

        // 2. Create a set of the top 10 most visited tourist attractions in the world and print out its size
        Set<String> touristAttractions = new HashSet<String>();
        touristAttractions.add("Eiffel Tower");
        touristAttractions.add("Great Wall of China");
        touristAttractions.add("Statue of Liberty");
        touristAttractions.add("Machu Picchu");
        touristAttractions.add("Colosseum");
        touristAttractions.add("Taj Mahal");
        touristAttractions.add("Disneyland");
        touristAttractions.add("Grand Canyon");
        touristAttractions.add("Niagara Falls");
        touristAttractions.add("Burj Khalifa");
        System.out.println("Number of Tourist Attractions: " + touristAttractions.size());

        // 3. Create a map of the 5 largest cities in the United States and their populations
        Map<String, Integer> largestCities = new HashMap<>();
        largestCities.put("New York", 8419600);
        largestCities.put("Los Angeles", 3980400);
        largestCities.put("Chicago", 2716000);
        largestCities.put("Houston", 2328000);
        largestCities.put("Phoenix", 1690000);

        System.out.println("Largest Cities in the US and Their Populations:");
        Set<String> cities = largestCities.keySet();
        for (String city : cities) {
            System.out.println(city+ ": " + largestCities.get(city));
        }

        // 4. Create an array of 10 random integers and print out the sum of 3rd and 5th Value
        int[] randomIntegers = {10,35,34,23,11,34,55,21,5,7};
        int sum = randomIntegers[2] + randomIntegers[4];
        System.out.println("Sum of 3rd and 5th Values: " + sum);

        // 5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie
        List<String> highestGrossingMovies = new ArrayList<>();
        highestGrossingMovies.add("Avatar");
        highestGrossingMovies.add("Avengers: Endgame");
        highestGrossingMovies.add("Titanic");
        highestGrossingMovies.add("Star Wars: The Force Awakens");
        highestGrossingMovies.add("Avengers: Infinity War");
        System.out.println("3rd Highest-Grossing Movie: " + highestGrossingMovies.get(2));
    }
}

