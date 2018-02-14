package edu.jsu.mcis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe {

    private static final int DEFAULT_WIDTH = 3;

    public static void main(String[] args) {
        
        /* Set initial size of game board (default is 3x3) */

        int width = DEFAULT_WIDTH;
        
        /* If a different size is provided as a command-line argument, use it instead */

        if(args.length >= 1) {
            
            try {
                width = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) {}
            
        }
        
        /* Create MVC Objects */

        TicTacToeModel model = new TicTacToeModel(width);
        TicTacToeView view = new TicTacToeView(model);
        
		/* Initialize the GUI */
        JFrame game = new JFrame("Tic-Tac-Toe");
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		game.add(view);
		game.pack();
		game.setVisible(true);
        

    }
}