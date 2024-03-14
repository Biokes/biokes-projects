package TicTacToe;

import java.util.Scanner;

public class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }
    private static int id =1;
    private Scanner input = new Scanner(System.in);

    private String getName(){
        return this.name;
    }
    public int playGame() {
        System.out.println("  "+getName( )+" Enter where you want to play: ");
        int  choice =  input.nextInt();
        return choice;
    }



}
