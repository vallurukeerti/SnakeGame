import javax.swing.*;

public class SnakeGame extends JFrame {
    private GameBoard board;
    public SnakeGame(){
        board = new GameBoard();
        add(board);
        setResizable(false);
        pack();
        setVisible(true);
    }
    public static void main(String[]args){
        JFrame snakegame = new SnakeGame();
    }
}
