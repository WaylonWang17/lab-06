package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * this class holds the city type objects in a list
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * this method adds a city object to the cities list
     * @param city
     * this is a city object we want to add to the list
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city){
        if (cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * This method sorts the list of cities
     * @return a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * checks whether city is in the list
     * @param city
     * @return true or false
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * deletes city if city in list
     * @param city
     */
    public void delete(City city){
        if (hasCity(city)){
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException("City not found");
        }
    }

    /**
     * counts the number of cities in the array
     * @return count
     */
    public int countCities(){
        int count = 0;
        for (int i = 0; i < cities.size(); i++){
            count++;
        }
        return count;
    }
}
