package com.training.java.assignments;

public class DataTypes_Assignment1 {
    public static void main(String[] args) {
        // Temperature of a city in degrees Celsius: 25.5
        // 25.5 is a decimal number with single decimal so we can store it in a float.
        float temperature = 25.5f;
        System.out.println("Temperature of a city in degrees Celsius: " + temperature);

        // Whether a customer has placed an order: true or false
        // A boolean type is ideal for storing true/false values.
        boolean hasPlacedOrder = true;
        System.out.println("Customer has placed an order: " + hasPlacedOrder);

        // Person's phone number: "123-456-7890"
        // Phone numbers are best stored as strings to preserve formatting.
        String phoneNumber = "123-456-7890";
        System.out.println("Person's phone number: " + phoneNumber);

        // Amount of money in a customer's bank account: 1000.50
        // A double type is used for precise decimal values.
        double bankBalance = 1000.50;
        System.out.println("Amount of money in a customer's bank account: " + bankBalance);

        // Person's email address: "john.doe@example.com"
        // Emails are strings as they are textual data.
        String emailAddress = "john.doe@example.com";
        System.out.println("Person's email address: " + emailAddress);

        // Coordinates of a location (latitude, longitude): 37.7749, -122.4194
        // Coordinates are stored as doubles for precision.
        double latitude = 37.7749;
        double longitude = -122.4194;
        System.out.println("Coordinates of a location: Latitude = " + latitude + ", Longitude = " + longitude);

        // Person's marital status: true or false
        // A boolean type represents marital status effectively.
        boolean isMarried = false;
        System.out.println("Person's marital status: " + isMarried);

        // Person's occupation: "Software Engineer"
        // Occupations are strings as they are textual data.
        String occupation = "Software Engineer";
        System.out.println("Person's occupation: " + occupation);

        // Person's favourite colour: "Blue"
        // Colours are also stored as strings.
        String favouriteColour = "Blue";
        System.out.println("Person's favourite colour: " + favouriteColour);

        // Current year: 2023
        // The year is an integer.
        int currentYear = 2023;
        System.out.println("Current year: " + currentYear);

        // Number of followers on a social media platform: 1,000,000
        // Large numbers are stored as integers.
        int numberOfFollowers = 1000000; //if number 
        String numberOfFollowersSocialMedia = "1,000,000";//if string with comma 
        System.out.println("Number of followers on a social media platform: " + numberOfFollowers);
        System.out.println("Number of followers on a social media platform: " + numberOfFollowersSocialMedia);

        // Rating of a movie: 7.5
        // Ratings with decimal points are stored as floats or doubles.
        float movieRating = 7.5f;
        System.out.println("Rating of a movie: " + movieRating);

        // Person's blood type: 'A'
        // Blood type is a single character and can be stored as a char.
        char bloodType = 'A';
        System.out.println("Person's blood type: " + bloodType);

        // Title of a book: "To Kill a Mockingbird"
        // Book titles are textual data, so use a string.
        String bookTitle = "To Kill a Mockingbird";
        System.out.println("Title of a book: " + bookTitle);

        // Number of employees in a company: 500
        // Number of employees is an integer value.
        int numberOfEmployees = 500;
        System.out.println("Number of employees in a company: " + numberOfEmployees);

        // Time of an event: 2:30 PM
        // Time is stored as a string for simplicity.
        String eventTime = "2:30 PM";
        System.out.println("Time of an event: " + eventTime);

        // Name of a country: "United States"
        // Country names are textual data, so use a string.
        String countryName = "United States";
        System.out.println("Name of a country: " + countryName);

        // Person's eye color: "Brown"
        // Eye color is textual data, so use a string.
        String eyeColor = "Brown";
        System.out.println("Person's eye color: " + eyeColor);

        // Person's birthplace: "New York City"
        // Birthplace is textual data, so use a string.
        String birthplace = "New York City";
        System.out.println("Person's birthplace: " + birthplace);

        // Distance between two cities: 200.5
        // Distance is a decimal number, so store it as a float or double.
        float distanceBetweenCities = 200.5f;
        System.out.println("Distance between two cities: " + distanceBetweenCities);
    }
}

