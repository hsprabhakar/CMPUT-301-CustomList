import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import com.example.simpleparadox.listycity.MainActivity;

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
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
        // should not work above


    }

    private void assertEquals(int count, int i) {
    }

//    public void addCity(City city){
//        cities.add(city);
//        return;
//    }

}
