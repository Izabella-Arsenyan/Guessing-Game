import javax.swing.JOptionPane;	//importing jOptionPane, util package, and throws IO Exception
import java.util.*;
import java.io.*;

public class Game{
    Start t;
    char [] gameboard;
    char l;
    String s;
    String letter;
    int count;
    boolean playAgain;
    String play;
    int numTries;

    public Game()throws IOException
    {
        t = new Start();	//Start object
        gameboard = new char[t.getLength()];	//creating an array gameboard of chars
        count=0;
        playAgain=true;			//variable to test if user wants to play game again
        numTries=0;

        for(int x=0;x<t.getLength();x++) 	//populatiing gameboard with _ characters of the length of the word.
        {
            gameboard[x]='_';
        }

    }
    public void playGame()throws IOException		//game method
    {

        while(playAgain==true)		//user will be prompted to if wants to playagain if user does not playAgain will = false
        {


            while(count<4 && gameWon()!=true ) //test variables to keep getting usres input until guesses wrong four times or completes word
            {
                getLetter();		//calls getLetter methods
                testLetter();		//calls testLetter methods
            }


            if (gameWon()==true)	//determines if user wins
            {
                numTries++;		//keeps track of number of times user wins
                JOptionPane.showMessageDialog(null,"Congradulations you guessed the word!");
            }


            if(count>=4)		//test for number of tries
            {
                JOptionPane.showMessageDialog(null,"Sorry you ran out of guesses.\n The word was " + t.getWord());
            }


            play= JOptionPane.showInputDialog("Type 'y' to play game, anything else to quit");
            if (play.compareToIgnoreCase("y")!=0) //testing users input whether wants to play again or not.
            {
                playAgain=false;		//stops game method from playing again
                JOptionPane.showMessageDialog(null, "You won " + numTries + " time(s)!");

            }
                else{	//if input is is equal to y
                count=0;		//resets counter
                t = new Start();			//calls Start object for another word
                System.out.println("aaaaaaaaaaaaaaaaaaaaa");
                gameboard = new char[t.getLength()];	//creates a new gameboard

                for(int x=0;x<t.getLength();x++)
                {
                    gameboard[x]='_';
                }

            }
        }
    }



    public boolean gameWon() throws IOException   //method to test if user guessed every letter returns a boolean
    {
        boolean winner=true;
        for(int x=0;x<t.getLength();x++)
        {
            if(gameboard[x]=='_') //returns false if an underscore is found.
            {
                winner=false;
            }
        }
        return winner;
    }




    public void getLetter() //method to get input of a letter
    {

        s= "Choose a letter to complete the word:\n";

        for(char str: gameboard)
        {
            s+=str + " ";											//printing gameboard
        }
        s+="\nThere are " +t.getLength() + " letters in this word";

        letter = JOptionPane.showInputDialog(s);

        if(letter==null) //testing to see if user hit the cancel button
        {
            JOptionPane.showMessageDialog(null,"Program Interupted\n Good-bye!");
            System.exit(0);	//ends the program
        }


        while(letter.length()==0 || Character.isLetter(letter.charAt(0))== false)		//tests conditions of input whether the input was a letter or not
        {
            JOptionPane.showMessageDialog(null,"Invalid answer!");
            letter = JOptionPane.showInputDialog(s);
            if(letter==null)											//testing to see if user hit the cancel button
            {
                JOptionPane.showMessageDialog(null,"Program Interupted!\n Good-bye!");
                System.exit(0);
            }

        }
        l=letter.charAt(0);
    }


    public void testLetter()		//tests the letter if it is found in the word and replaces that letter
    {								// to the corresponding area on the gameboard

        boolean letterword=false;			//boolean of whether word is in gameboard and replaces that letter on the gameboard
        for(int x=0;x<t.getLength();x++)
        {
            if(l==(t.getWord().charAt(x)))
            {
                gameboard[x]=l;
                letterword=true;
            }

        }
        if(letterword==false)	//tests if letter was not in the word
        {						//increments count if not
            count++;
            JOptionPane.showMessageDialog(null, l + " is not in the word\nYou have " + (4-count) + "  tries remaining" );
        }

    }
}