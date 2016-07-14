public class Game {

    private int grid[][] = new int[3][3];

    public int play(final int column, final int row, final int player) {
        if (grid[column][row] != 0)
            return -1;
        grid[column][row] = player;
        if (isWinningCondition(player))
            return 1;
        else
            return 0;
    }

    private boolean isWinningCondition(int player) {
        return isColumnComplete(player) || isRowComplete(player) || isDiagonalComplete(player);
    }

    private boolean isColumnComplete(final int playerNumber) {
        return grid[0][0] == playerNumber && grid[0][1] == playerNumber && grid[0][2] == playerNumber
                || grid[1][0] == playerNumber && grid[1][1] == playerNumber && grid[1][2] == playerNumber
                || grid[2][0] == playerNumber && grid[2][1] == playerNumber && grid[2][2] == playerNumber;
    }

    private boolean isRowComplete(final int playerNumber) {
        return grid[0][0] == playerNumber && grid[1][0] == playerNumber && grid[2][0] == playerNumber
                || grid[0][1] == playerNumber && grid[1][1] == playerNumber && grid[2][1] == playerNumber
                || grid[0][2] == playerNumber && grid[1][2] == playerNumber && grid[2][2] == playerNumber;
    }

    private boolean isDiagonalComplete(final int playerNumber) {
        return grid[0][0] == playerNumber && grid[1][1] == playerNumber && grid[2][2] == playerNumber
                || grid[0][2] == playerNumber && grid[1][1] == playerNumber && grid[2][0] == playerNumber;
    }
}
