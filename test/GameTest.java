import TicTacToe.CellOccupiedException;
import TicTacToe.InvalidCellNumberException;
import game.Game;
import game.GamePlayer;
import game.WinnerExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static game.Cell.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void test_twoPlayersPlay_cellChanges(){
        GamePlayer player1=new GamePlayer( );
        GamePlayer player2=new GamePlayer( );
        player1.play(game, 4);
        assertEquals(X, game.check(1, 0));
        player2.play(game, 1);
        assertEquals(O, game.check(0, 0));
    }

    @Test
    void test_afterPlaysResultToWins_morePlaysThrowsWinnerException(){
        GamePlayer player1=new GamePlayer( );
        GamePlayer player2=new GamePlayer( );
        player1.play(game, 4);
        assertEquals(X, game.check(1, 0));
        player2.play(game, 1);
        assertEquals(O, game.check(0, 0));
        player1.play(game, 5);
        assertEquals(X, game.check(1, 1));
        player2.play(game, 2);
        assertEquals(O, game.check(0, 1));
        player1.play(game, 6);
        assertEquals(X, game.check(1, 2));
        assertThrows(WinnerExistException.class, ()->player2.play(game, 9));
    }

    @Test
    void testPlayerPlayOnACellTwice_throwException(){
        GamePlayer player1=new GamePlayer( );
        GamePlayer player2=new GamePlayer( );
        player1.play(game, 4);
        assertEquals(X, game.check(1, 0));
        player2.play(game, 1);
        assertEquals(O, game.check(0, 0));
        assertThrows(CellOccupiedException.class, ()->player1.play(game, 4));
        assertThrows(CellOccupiedException.class, ()->player2.play(game, 1));
    }

    @Test
    void test_PlayersEntersInvalidMove_exceptionIsThrown(){
        GamePlayer player1=new GamePlayer( );
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, -1));
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, 90));
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, 15));
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, -9));
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, 118));
        assertThrows(InvalidCellNumberException.class, ()->player1.play(game, 0));
    }
}
