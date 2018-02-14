package edu.jsu.mcis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeView extends JPanel implements ActionListener{

    TicTacToeModel model;
	
	private JPanel squaresPanel;
	private JButton[][] squares;
	private JLabel resultLabel;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
		
		int width = model.getWidth();
        
		setLayout( new BoxLayout(this, BoxLayout.PAGE_AXIS));
		squaresPanel = new JPanel(new GridLayout(model.getWidth(), model.getWidth()));
		squares = new JButton[model.getWidth()][model.getWidth()];
		resultLabel = new JLabel();
		resultLabel.setName("ResultLabel");
		
		for(int row=0; row<model.getWidth();row++){	
			for(int col=0; col<model.getWidth();col++){
				squares[row][col] = new JButton();
				squares[row][col].setPreferredSize(new Dimension(64, 64));
				squares[row][col].addActionListener(this);
				squares[row][col].setName("Square" + row + col);
				squaresPanel.add(squares[row][col]);
			}
		}
		add(squaresPanel);
		add(resultLabel);
		
		resultLabel.setText("Welcome to Tic-Tac-Toe!");
		
	
	}
	

	@Override
	public void actionPerformed(ActionEvent event){
		
		for(int i=0;i<model.getWidth();i++){
			for(int j=0;j<model.getWidth();j++){
				if(event.getSource() == squares[i][j] && model.makeMark(i, j))
					squares[i][j].setText(model.getMark(i, j).toString());
			}
		}
		if(model.isXTurn() == true){
			resultLabel.setText("\n\n Player 1 (X) Move");
		}
		if(model.isXTurn() == false){
			resultLabel.setText("\n\n Player 2 (O) Move");
		}
		if(model.getResult() == TicTacToeModel.Result.X){
			resultLabel.setText("X");
		}
		if(model.getResult() == TicTacToeModel.Result.O){
			resultLabel.setText("O");
		}
		if(model.getResult() == TicTacToeModel.Result.TIE){
			resultLabel.setText("TIE");
		}
	}
}


