import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;

public class Start {
    String [] array;
    String word;


    public Start() throws IOException {    //constructor
        array = new String[10];
        getFile();    //creating a new string array
        //random();    //calling the getFile and random methods
    }

    public static void message() {         //welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Word-Guessing Game!\nYou will choose a category of words and try to\n guess the letters in the word.");
    }
    public void getFile() throws IOException
    {
        String file;
        String category;

        category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Famous Armenians\n 2.Top social media platforms\n 3.Top programming languages ");

        while((category.equals("1")==false) && (category.equals("2")==false) && (category.equals("3")==false))
        {
            JOptionPane.showMessageDialog(null,"Invalid Answer");
            category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Famous Armenians\n 2.Top social media platforms\n 3.Top programming languages ");
        }

        Famous_Armenianss famousObj = new Famous_Armenianss();
        top_social_media_platforms top_socObj = new top_social_media_platforms();
        top_programming_languages top_progObj = new top_programming_languages();

        //taking users input and testing which file to be used
        switch(category)
        {

            case "1": file= famousObj.random_armenians();
                break;
            case "2":file = top_socObj.random_platforms();
                break;
            default :file = top_progObj.random_languages();
                break;
        }

        this.word=file;
    }

    public void random() {
        Random random = new Random();        //creating random word object
        int randomNum =random.nextInt(array.length); //getting a random number based on length of array

        word = array[randomNum];

    }
    public int getLength() {
        return word.length();     //gets length of word and returns and integer
    }
    public String getWord() {
        return word;             //get the word and returns a string
    }
}