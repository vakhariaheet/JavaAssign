package TicTacToe;
import TicTacToe.Moves.Board;

class Init {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board();
        game.start();
        board.display();
    }
}