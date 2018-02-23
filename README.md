# Tic Tac Toe Game
A tic tac toe game created using Java and styled into a GUI version by using Java swing elements.

## Install and Run
For this project you need Java 8 installed on your workstation for your code and gradle installed to be able to test your code with the test cases provided that checks all the possibilities that can happen during a game of tic tac toe. If you have those installed, then clone the repository from github onto your local workstation. 
```sh
git clone https://github.com/zman322/cs310-tic-tac-toe
```
Then after that then open up a command prompt or terminal window, navigate to the destination where you cloned the repository to, and and run the gradle tool with all the unit tests.
```sh
gradle clean build jacocoTestReport runrobot
```
Then after a successful build of the project you will then enter this command to begin a game of tic tac toe.
```sh
java -jar build\libs\cs310-tic-tac-toe-1.0.jar 
```

## Playing the Game
The game will begin with Player 1 being X and Player 2 being O. The game starts by Player 1 clicking his/her desired spot on the board, then Player 2 does the same. The game will continue in this alternating fashion until their either is a winner or a tie. 

## Screenshots 
This shows what the game board looks like during a current game.

<img width="316" alt="screen shot 2018-02-22 at 11 15 17 pm" src="https://user-images.githubusercontent.com/22325197/36579019-62562fd6-1826-11e8-8e52-d145d57ce832.png">
