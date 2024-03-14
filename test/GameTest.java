import game.Game;
import game.GamePlayer;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static game.Cell.EMPTY;
import static game.Cell.X;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest{
    private Game game;

    @BeforeEach
    void initialize(){
        game=new Game( );
    }
    @Test
    void test_GameBoardIsEmpty(){
        for( int row=0; row<3; row++ )
            for( int column=0; column<3; column++ )
                assertEquals(EMPTY, game.check(row, column));
    }

    @Test
    void test_playerPlays_cellChanges(){
        GamePlayer player1=new GamePlayer( );
        player1.play(game, 4);
        assertEquals(X, game.check(1, 0));
    }
}
