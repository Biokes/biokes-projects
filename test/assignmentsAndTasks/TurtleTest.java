package assignmentsAndTasks;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import taskAndAssignments.Board;
import taskAndAssignments.Turtle;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static taskAndAssignments.Direction.*;

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
        assertSame(EAST, pet.currentDirection( ));
    }

    @Test
    public void test_turtleFaceNorth_turtleTurnsRight(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnLeft( );
        assertSame(NORTH, pet.currentDirection( ));
    }

    @Test
    public void test_turtleFaceNorth_turtleTurnLeft(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnLeft( );
        pet.turnLeft( );
        assertSame(WEST, pet.currentDirection( ));
    }

    @Test
    public void test_turtleFaceWest_turtleTurnLeft(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnLeft( );
        pet.turnLeft( );
        pet.turnLeft( );
        assertSame(SOUTH, pet.currentDirection( ));
    }

    @Test
    public void test_turtleFaceEast_turtleTurnLeft(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnLeft( );
        pet.turnLeft( );
        pet.turnLeft( );
        pet.turnLeft( );
        assertSame(EAST, pet.currentDirection( ));
    }

    @Test
    public void testTurtleTurnRight_turtleFacesSouth(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnRight( );
        assertSame(SOUTH, pet.currentDirection( ));
    }

    @Test
    public void test_turtleTurnsRight_turtleFacesWest(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnRight( );
        pet.turnRight( );
        assertSame(WEST, pet.currentDirection( ));
    }

    @Test
    public void test_turtleTurnsRight_turtleFacesNorth(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnRight( );
        pet.turnRight( );
        pet.turnRight( );
        assertSame(NORTH, pet.currentDirection( ));
    }

    @Test
    public void test_turtleTurnsRight_turtleFacesEast(){
        assertSame(EAST, pet.currentDirection( ));
        pet.turnRight( );
        pet.turnRight( );
        pet.turnRight( );
        pet.turnRight( );
        assertSame(EAST, pet.currentDirection( ));
    }

    @Test
    public void test_moveForward_sketchPadDraw(){
        pet.penDown( );
        pet.move(5);
        for( int counter=0; counter<5; counter++ )
            assertEquals(1, pet.checkBoard(0, counter));

    }

    @Test
    public void test_moveLeftMoveRightPenDown_borardValueIsChanged(){
        pet.penDown( );
        pet.move(5);
        for( int counter=0; counter<5; counter++ )
            assertEquals(1, pet.checkBoard(0, counter));
        System.out.println(pet.toString( ));
        pet.turnRight( );
        pet.move(5);
        System.out.println(pet.toString( ));
        for( int counter=0; counter<5; counter++ )
            assertEquals(1, pet.checkBoard(4, counter));
        System.out.println(pet.toString( ));
    }

}
