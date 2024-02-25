package TicTacToe;

import TicTacToe.Operations.*;


import Game.Demo;

public class Init {
    public static void main(String[] args) {
        Board board = new Board();
        board.displayBoard();
        User user = new User();
        user.displayUser();
        Demo demo = new Demo();
        demo.displayDemo();
    }
}