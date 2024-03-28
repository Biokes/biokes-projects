package fireDrills;

import fireDrill1.FireDrill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillTest {
    @Test
    void testAgeGetter(){
       assertEquals( 1,FireDrill.getAge2("12/12/2022"));
    }
    @Test
    void testAgeGetter2(){
        assertEquals( 2,FireDrill.getAge2("12/01/2022"));
        assertEquals(2, FireDrill.getAge2("12/03/2022"));
        assertEquals(16,FireDrill.getAge2("12/12/2007"));
        assertEquals( 23,FireDrill.getAge2("31/12/2000"));
        assertEquals(18, FireDrill.getAge2("27/02/2006"));
    }

    @Test
    void testMinMax(){
        assertArrayEquals(new int[]{6}, FireDrill.getDifference(new int[]{2, 4, 5, 7, 8}));
        assertArrayEquals(new int[]{8}, FireDrill.getDifference(new int[]{2, 1, 3, 4, 9}));
    }

}
