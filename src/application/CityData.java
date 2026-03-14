package application;

import java.util.ArrayList;

public class CityData {

    public static ArrayList<City> getCities() {
        ArrayList<City> cities = new ArrayList<>();

        cities.add(new City("Green Bay", 6, "Bright suburban sky. Only major constellations visible."));
        cities.add(new City("Chicago", 9, "Inner city sky. Very few stars visible."));
        cities.add(new City("Denver", 7, "Moderately bright sky with limited star visibility."));
        cities.add(new City("Flagstaff", 2, "Very dark sky. Excellent for stargazing."));
        cities.add(new City("Tokyo", 9, "Extremely bright sky due to heavy light pollution."));
        cities.add(new City("Los Angeles", 8, "City sky very bright. Some stars visible."));
        cities.add(new City("Sedona", 3, "Dark skies with some city light on horizon."));
        cities.add(new City("Hawaii Big Island", 2, "Very dark sky. Great for observing Milky Way."));
        cities.add(new City("Amsterdam", 8, "Urban sky. Few stars visible."));
        cities.add(new City("Santiago", 5, "Moderately dark sky in outskirts."));

        return cities;
    }
}