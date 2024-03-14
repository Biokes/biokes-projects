import game.Game;
import org.junit.jupiter.api.Test;

import static game.Cell.EMPTY;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest{
    @Test
    void test_GameBoardIsEmpty(){
        Game game=new Game( );
        for( int row=0; row<3; row++ )
            for( int column=0; column<3; column++ )
                assertEquals(EMPTY, game.check(row, column));
    }
}
