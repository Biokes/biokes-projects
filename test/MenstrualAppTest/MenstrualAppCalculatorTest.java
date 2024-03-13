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
        assertEquals("2024/01/29", app.getNextStart("01/01/2024", 28));
        assertEquals("2020/10/27", app.getNextStart("12/10/2020", 15));
        assertEquals("2024/03/01", app.getNextStart("22/02/2024", 8));
        assertEquals("2023/03/01",app.getNextStart("22/02/2023",7));
    }
    @Test
    void test_invalidDate_throwException(){
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/23/1232",1));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032",1));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032",1));
        assertThrows(InvalidDateException.class,()->app.getNextStart("qo23/2032",1));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1-kqe23/2032",1));
    }
    @Test
    void test_validDateISGiven_nextOvulationDateIsCalculated(){
        app.setLastFlowStop("22/02/2023");
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/23/1232",1));
        assertThrows(InvalidDateException.class,()->app.getNextStart("1/023/2032",1));
        assertEquals("2023/03/01",app.getNextStart("22/02/2023",7));
        assertEquals("",app.getNextOvulationDate());
    }

}
