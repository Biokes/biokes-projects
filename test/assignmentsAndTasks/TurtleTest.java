package assignmentsAndTasks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import taskAndAssignments.Turtle;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static taskAndAssignments.Direction.EAST;

public class TurtleTest{

    private Turtle pet=new Turtle( );

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
        assertFalse(pet.isPenUp( ));
    }

    @Test
    public void penIsDown_penIsTakenBackUp(){
        assertTrue(pet.isPenUp( ));
        pet.penDown( );
        assertFalse(pet.isPenUp( ));
        pet.penUp( );
        assertTrue(pet.isPenUp( ));
    }

    @Test
    public void test_turtleFacesEast_turtleTurnsLeft(){
        assertEquals(EAST, pet.currentDirection( ));
    }
}
