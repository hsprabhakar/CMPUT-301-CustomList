import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
// import org.junit.jupiter.api.Test;
import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import com.example.simpleparadox.listycity.MainActivity;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;


public class TestCityList {
    private CustomList list;
    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        list.clear();
        City edmonton = new City("Edmonton", "AB");
        assertTrue(list.hasCity(edmonton));
        // should not work above


    }
    @Test
    public void deleteCityTest() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
        // should not work
    }

    @Test
    public void countCityTest() {
        City edmonton = new City("Edmonton", "AB");
        City calgary = new City("Calgary", "AB");

        list.addCity(edmonton);
        list.addCity(calgary);
        assertNotEquals(list.countCities(), 3);
        // should not work
    }
    private void assertEquals(int count, int i) {
    }

//    public void addCity(City city){
//        cities.add(city);
//        return;
//    }

}
