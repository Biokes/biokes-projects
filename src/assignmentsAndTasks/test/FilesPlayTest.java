package assignmentsAndTasks.test;

import org.junit.jupiter.api.Test;

import static assignmentsAndTasks.src.assignmentsAndTasks.chapter15.FilesPlays.getAllTransactionsOn;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesPlayTest {
    @Test
    void testFilesTransactions(){
    assertEquals(2,getAllTransactionsOn("","").size());
    }

}
