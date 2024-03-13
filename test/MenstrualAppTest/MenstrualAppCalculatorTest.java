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
    void test_nextCycleDateISGotten() {
        app.setLastFlowStop("31/12/2023");
        assertEquals("2024-01-29", app.getNextStart("01/01/2024", 28));
        assertEquals("2020-10-27", app.getNextStart("12/10/2020", 15));
        assertEquals("2024-03-01", app.getNextStart("22/02/2024", 8));
        assertEquals("2023-03-01",app.getNextStart("22/02/2023",7));
    }

}
