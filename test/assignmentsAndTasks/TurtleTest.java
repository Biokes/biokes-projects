package assignmentsAndTasks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import taskAndAssignments.Turtle;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TurtleTest{

    private Turtle pet;

    @BeforeEach
    private void initializer(){
        pet=new Turtle( );


    }
    @Test
    public void testPenIsUP(){
        assertTrue(pet.isPenUp( ));

    }

    @Test
    public void testPenIsUp_takePenDown(){
        assertTrue(pet.isPenUp( ));
        pet.penDown( );
        assertFalse(pet.penIsDown( ));
    }
}
