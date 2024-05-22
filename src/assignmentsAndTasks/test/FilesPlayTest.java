package assignmentsAndTasks.test;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;

import static assignmentsAndTasks.src.assignmentsAndTasks.chapter15.FilesPlays.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesPlayTest {
    @Test
    void testFilesTransactionsOnGivenDates(){
    assertEquals(1,getAllTransactionsOn("2024-12-01",
            "C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js").size());
    assertEquals(3, getAllTransactionsOn("2024-12-09",
            "C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js").size());
    assertEquals(1, getAllTransactionsOn("2024-12-22",
            "C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js").size());
    }
    @Test
    void testTransactionsForPEiodBetweenGivenDates() throws IOException{
        assertEquals(2,getTransactionsWithin("2024-12-21","2024-12-22",
        "C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js").size());
    }
    @Test
    void testGetAverageTransaction(){
        assertEquals(104500,getAverageTransaction("2024-12-21","2024-12-22",
        "C:\\Users\\DELL\\IdeaProjects\\fireDrills\\src\\assignmentsAndTasks\\src\\assignmentsAndTasks\\drill\\value.js"));
    }
}
