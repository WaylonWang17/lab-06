package com.example.listycity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class handles unit tests
 */
public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    public City mockCity(){
        return new City("Edmonton", "AB");
    }
    @Test
    public void testAdd(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City c = new City("Regina", "SK");
        cityList.add(c);
        assertEquals(2, cityList.getCities().size());

    }

    @Test
    public void testGetCities(){
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        City c = new City("Charlottetown", "PEI");
        cityList.add(c);
        assertEquals(0, c.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void testAddException(){
        CityList cityList = mockCityList();
        City c = new City("Yellowknife", "NWT");
        cityList.add(c);
        assertThrows(IllegalArgumentException.class, ()->{
            cityList.add(c);
        });
    }

    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();
        City c = new City("Vancouver", "BC");
        cityList.add(c);
        assertTrue(cityList.hasCity(c));
    }

    @Test
    public void testDeleteCity(){
        CityList cityList = mockCityList();
        City c = new City("Vancouver", "BC");
        cityList.add(c);
        cityList.delete(c);
        assertEquals(1, cityList.countCities());
        assertThrows(IllegalArgumentException.class, ()->{
            cityList.delete(c);
        });
    }
    @Test
    public void testCountCities(){
        CityList cityList = mockCityList();
        City c = new City("Vancouver", "BC");
        cityList.add(c);
        assertEquals(1, mockCityList().countCities());
    }
}
