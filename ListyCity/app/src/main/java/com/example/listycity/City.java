package com.example.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    public String getCity(){
        return city;
    }

    /**
     * This method compares City objects based on their city name field.
     * @param o the object to be compared.
     * @return 0, -1 or 1 if two values are equal, less than, or greater than
     */
    @Override
    public int compareTo(City o){
        //City c = (City) o;
        return this.city.compareTo(o.getCity());
    }
}
