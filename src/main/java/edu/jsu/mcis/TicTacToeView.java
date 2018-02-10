package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        for(int i=0;i<model.width;i++){
            for(int j=0;j<model.width;j++){
                System.out.print(" " +j);
                System.out.print("/n");
                System.out.print(""+ model.getMark(i,j));
            }
            System.out.println(""+i);
        }


    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if( model.isXTurn()==true){
            System.out.println("Player 1 (X) Move: ");
            System.out.println("Enter the row and column numbers, separated by a space: ");
        }
        elseif(model.isXTurn()==false){
            System.out.println("Player 2 (O) Move: ");
            System.out.println("Enter the row and column numbers, separated by a space: ");
        }

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("Input error");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}