package assignmentsAndTasks;

import org.junit.Test;
import taskAndAssignments.Turtle;

import static junit.framework.TestCase.assertTrue;

public class TurtleTest{
    @Test
    void testPenIsUP(){
        Turtle pet=new Turtle( );
        assertTrue(pet.isPenUp( ));
    }
}
