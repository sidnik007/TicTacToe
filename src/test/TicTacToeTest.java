import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
    @Test
    public void given3x3Board_whenPlayer1FirstColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 1));
        assertEquals(0, game.play(0, 1, 1));
        assertEquals(1, game.play(0, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer1MiddleColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(1, 0, 1));
        assertEquals(0, game.play(1, 1, 1));
        assertEquals(1, game.play(1, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer1LastColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(2, 0, 1));
        assertEquals(0, game.play(2, 1, 1));
        assertEquals(1, game.play(2, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer2FirstColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 2));
        assertEquals(0, game.play(0, 1, 2));
        assertEquals(1, game.play(0, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer2MiddleColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(1, 0, 2));
        assertEquals(0, game.play(1, 1, 2));
        assertEquals(1, game.play(1, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer2LastColumnHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(2, 0, 2));
        assertEquals(0, game.play(2, 1, 2));
        assertEquals(1, game.play(2, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer1FirstRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 1));
        assertEquals(0, game.play(1, 0, 1));
        assertEquals(1, game.play(2, 0, 1));
    }

    @Test
    public void given3x3Board_whenPlayer1MiddleRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 1, 1));
        assertEquals(0, game.play(1, 1, 1));
        assertEquals(1, game.play(2, 1, 1));
    }

    @Test
    public void given3x3Board_whenPlayer1LastRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 2, 1));
        assertEquals(0, game.play(1, 2, 1));
        assertEquals(1, game.play(2, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer2FirstRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 2));
        assertEquals(0, game.play(1, 0, 2));
        assertEquals(1, game.play(2, 0, 2));
    }

    @Test
    public void given3x3Board_whenPlayer2MiddleRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 1, 2));
        assertEquals(0, game.play(1, 1, 2));
        assertEquals(1, game.play(2, 1, 2));
    }

    @Test
    public void given3x3Board_whenPlayer2LastRowHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 2, 2));
        assertEquals(0, game.play(1, 2, 2));
        assertEquals(1, game.play(2, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer1DiagonalFromLeftHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 1));
        assertEquals(0, game.play(1, 1, 1));
        assertEquals(1, game.play(2, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer1DiagonalFromRightHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(2, 0, 1));
        assertEquals(0, game.play(1, 1, 1));
        assertEquals(1, game.play(0, 2, 1));
    }

    @Test
    public void given3x3Board_whenPlayer2DiagonalFromLeftHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(0, 0, 2));
        assertEquals(0, game.play(1, 1, 2));
        assertEquals(1, game.play(2, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer2DiagonalFromRightHas3items_thenWin() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(2, 0, 2));
        assertEquals(0, game.play(1, 1, 2));
        assertEquals(1, game.play(0, 2, 2));
    }

    @Test
    public void given3x3Board_whenPlayer1PlaysTwiceAtSameSpot_thenThrowError() throws Exception {
        Game game = new Game();
        assertEquals(0, game.play(2, 0, 2));
        assertEquals(-1, game.play(2, 0, 2));
    }
}
