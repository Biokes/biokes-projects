package assignmentsAndTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ModeTest{
    @Test
    void testMode(){
        int[] input={1, 2, 2, 3, 4, 2};
        assertArrayEquals(new int[]{3, 2}, Mode.mode_value(input));
    }
}
