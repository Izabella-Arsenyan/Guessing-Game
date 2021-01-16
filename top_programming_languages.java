import java.util.Random;
import java.lang.String;
class top_programming_languages {
    //    public pl(){}
    public static String[] languages_array(){
        String[] pl = new String[10];
        pl[0] = new String("Python");
        pl[1] = new String("JavaScript");
        pl[2] = new String("Java");
        pl[3] = new String("C#");
        pl[4] = new String("C");
        pl[5] = new String("C++");
        pl[6] = new String("GO");
        pl[7] = new String("R");
        pl[8] = new String("Swift");
        pl[9] = new String("PHP");

        return pl;
    }
    //method for random choosing question from array
    public static String random_languages(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        return languages_array()[index];
    }
}
