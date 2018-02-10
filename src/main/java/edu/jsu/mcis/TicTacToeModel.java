package edu.jsu.mcis;
import java.util.Arrays;

public class TicTacToeModel{
    
    private static final int DEFAULT_WIDTH = 3;
    
    /* Mark (represents X, O, or an empty square */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY(" ");

        private String message;
        
        private Mark(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* Result (represents the final state of the game: X wins, O wins, a tie,
       or NONE if the game is not yet over) */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("Tie"), 
        NONE("none");

        private String message;
        
        private Result(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    private Mark[][] grid; /* Game grid */
    private boolean xTurn; /* True if X is current player */
    private int width;     /* Size of game grid */
    
    /* DEFAULT CONSTRUCTOR */
    
    public TicTacToeModel() {
        
        /* No arguments (call main constructor; use default size) */
        
        this(DEFAULT_WIDTH);
        
    }
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel(int width) {
        
        /* Initialize width; X goes first */
        
        this.width = width;
        xTurn = true;
        
        /* Create grid (width x width) as a 2D Mark array */

        /* INSERT YOUR CODE HERE */
        Mark[][] grid= new Mark[width][width];

        /* Initialize grid by filling every square with empty marks */

        /* INSERT YOUR CODE HERE */
         for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
                grid[i][j]=Mark.EMPTY;
            }
        }
    }
	
    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty! */
        
        /* INSERT YOUR CODE HERE */
        if( (row<=width) && (col<=width) ){
            if(xTurn==true)
                grid[row][col]=Mark.X; //dont know how yet
            else
                grid[row][col]=Mark.Y; // dont know how yet

        }

        return true;
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within grid bounds */
        
        /* INSERT YOUR CODE HERE */
        if( (isSquareMarked(row,col)) && (row>=0) && (col>=0) )
            return true; 
        else
            return null;
        
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is marked */
        
        /* INSERT YOUR CODE HERE */
        if(grid[row][col]!=Mark.EMPTY)
            return true;
        else 
            return false;

        
            
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return mark from the square at the specified location */
        
        /* INSERT YOUR CODE HERE */
        if(grid[row][col]==Mark.X)
            return Mark.X;
        elif(grid[row][col]==Mark.O)
            return Mark.O;
        else
            return Mark.EMPTY;

        
            
    }
	
    public Result getResult() {
        
        /* Use isMarkWin() to see if X or O is the winner, if the game is a
           tie, or if the game is not over, and return the corresponding Result
           value */
        
        /* INSERT YOUR CODE HERE */
        if(isMarkWin(Mark.X)==true)
            return Result.X;
        elif(isMarkWin(Mark.O)==true)
            return Result.O;
        elif(isTie==true)
            return Result.TIE;
        else
            return Result.NONE;


    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
        
        /* INSERT YOUR CODE HERE */
        bool tmp=false;
        //columns
        for (int i=0;i<width;i++){  
            for(int j=0;j<width;j++){
                if(!grid[i][j].equals(mark)){
                    tmp=false;
                }
                else
                    tmp=true;
            }
            return tmp;
        }
        //rows
        for(int i=0;i<width;i++){  
            for(int j=0;j<width;j++){
                if(!grid[j][i].equals(mark)){
                    tmp=false;
                }
                else
                    tmp=true;
            }
            return tmp;
        }
        //diagonal        
        for (int i=0;i<width;i++){  
            for(int j=0;j<width;j++){
                if(!grid[i][i].equals(mark)){
                    tmp=false;
                }
                else
                    tmp=true;
            }
            return tmp;
        }
        //backwards diagonal
        for (int i=0;i<width;i++){  
            for(int j=width;j<0;j--){
                if(!grid[i][j].equals(mark)){
                    tmp=false;
                }
                else
                    tmp=true;
            }
            return tmp;
        }
        


        

    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        /* INSERT YOUR CODE HERE */
        tmp=false;
        if((isMarkWin(Mark.X)||isMarkWin(Mark.O))==false){
            for(int i=0;i<width;i++){
                for(int j=0;j<width;j++){
                    if(grid[i][j]!=Mark.EMPTY)
                        tmp=true;
                    else{
                        tmp=false;
                        break;
                    }

                }
            }
            return tmp;
        }

       
        
    }

    public boolean isGameover(){
        
        /* Return true if the game is over */
        
        return Result.NONE != getResult();
        
    }

    public boolean isXTurn(){
        
        /* Getter for xTurn */
        
        return xTurn;
        
    }

    public int getWidth(){
        
        /* Getter for width */
        
        return width;
        
    }
    
}