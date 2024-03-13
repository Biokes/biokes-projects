package MenstrualAppTest;

import MentrualApp.InvalidDateException;
import MentrualApp.MenstrualApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppCalculatorTest {
    private MenstrualApp app;

    @BeforeEach
    void createNewObject() {
        app = new MenstrualApp();
    }
    @Test
    void test_validDate_nextCycleDateISGotten() {
        app.setLastFlowStop("31/12/2023");
        app.setCycleLength(28);
        assertEquals("2024/01/29", app.getNextStart("01/01/2024"));
        app.setCycleLength(15);
        assertEquals("2020/10/27", app.getNextStart("12/10/2020"));
        app.setCycleLength(8);
        assertEquals("2024/03/01", app.getNextStart("22/02/2024"));
        app.setCycleLength(7);
        assertEquals("2023/03/01",app.getNextStart("22/02/2023"));
    }
    @Test
    void test_invalidDate_throwException(){
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/23/1232"));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032"));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032"));
        assertThrows(InvalidDateException.class,()->app.getNextStart("qo23/2032"));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1-kqe23/2032"));
    }
    @Test
    void test_validDateISGiven_nextOvulationDateIsCalculated(){
        app.setLastFlowStop("22/02/2023");
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/23/1232"));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032"));
        app.setCycleLength(7);
        assertEquals("2023/03/01",app.getNextStart("22/02/2023"));
        assertEquals("2023/02/25",app.getNextOvulationDate());
    }
    @Test
    void test_lastFlowIsCollected_DetailsAreGiven(){
        assertThrows(InvalidDateException.class,()->app.setLastFlowStop("12/09/89"));
        app.setLastFlowStop("01/01/2023");
        app.setCycleLength(28);
        assertEquals("2023/01/29",app.getNextStart("01/01/2023"));
        assertEquals("2023/01/15",app.getNextOvulationDate());
        assertEquals("2023/01/12", app.getFertileDayStart());
        assertEquals("2023/01/18", app.getFertileDayEnd());
    }
    @Test
    void test_InvalidCycleLength_throwsError(){
        assertThrows(IllegalArgumentException.class, ()->app.setCycleLength(-1));
        assertThrows(IllegalArgumentException.class, ()->app.setCycleLength(0));
    }

}
