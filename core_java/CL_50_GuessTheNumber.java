
  import java.util.*;

//import java.util.Random;
//import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuess=0;

    Game(){
            Random rand = new Random();
       this.number=rand.nextInt(100);
       }

    void takeUserInput(){
        System.out.println("Guess The Number From 0 to 100");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

       }

    boolean isCorrectNumber(){
        noOfGuess++;
          if(inputNumber == number){
              System.out.format("Yes You Guess Correctly it was %d\n You Guess in %d attempts ",number,noOfGuess);
              return true;
          }
          else if (inputNumber < number){
              System.out.println("Too LOW...");
          }
          else{
             System.out.println("Too HIGH...");

          }
        return false;
       }




}


public class CL_50_GuessTheNumber {
    public static void main(String[]args){
        /*    *--Create a GAME "Guess the number"--*
         * Game should have the following Methods:
         * Constructor() to generate random numbers
         * UserInput() Take number input from user keyboard
         * isCorrectNumber() to detect whether the number  by user is correct
         * getter and setter for noOfGuesses()
         * Use properties such as:  noOfGuesses(int) etc to get this task done!
         */

        Game Gme = new Game();
        boolean b=false;
        while(!b) {
            Gme.takeUserInput();
           b = Gme.isCorrectNumber();
            System.out.println(b);
        }


    }
}
