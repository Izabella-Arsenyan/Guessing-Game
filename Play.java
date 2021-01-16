
import javax.swing.JOptionPane;
import java.util.*;				//import declarations
import java.io.*;
public class Play {
    public static void main(String [] args) throws IOException
    {
        //Calling welcome
        Start.message();
        //Game object
        Game g = new Game();
        //Play game method
        g.playGame();

    }
}