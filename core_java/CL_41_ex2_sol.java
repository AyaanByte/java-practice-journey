

import java.util.Random;
import java.util.Scanner;

public class CL_41_ex2_sol {
    public static void main(String[] args) {


        String[] rps={"R","P","S"};

        String computerMove=rps[new Random().nextInt(rps.length)];

        Scanner scanner=new Scanner(System.in);
        String playersMove;
        while (true) {
            System.out.println("Please Enter your move R , P or  S -> \"ROCK , PAPER ,SCISSOR\" ");
            playersMove = scanner.nextLine();
            if(playersMove.equals("R")||playersMove.equals("P")||playersMove.equals("S")){
                break;
            }
            System.out.println(playersMove+" is not Valid move");
        }


        System.out.println("Computer Played :- "+computerMove);
        // * Players
        if(playersMove.equals(computerMove)) {
            System.out.println("The game was tie!");
        }else if (playersMove.equals("R")&& computerMove.equals("S")||playersMove.equals("P")&& computerMove.equals("R")||playersMove.equals("S")&& computerMove.equals("P")){
            System.out.println("You Win!!");
        }else {
            System.out.println("You Lose");
        }

    }
}







