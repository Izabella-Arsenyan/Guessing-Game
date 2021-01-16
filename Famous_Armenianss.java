import java.util.Random;
import java.lang.String;

class Famous_Armenianss {
    //    public armenians(){}
    public static String[] armenians_array(){
        String[] fa = new String[10];
        fa[0] = new String("Charles Aznavur");
        fa[1] = new String("Serj Tankian");
        fa[2] = new String("Cher");
        fa[3] = new String("Andre Agassi");
        fa[4] = new String("Levon Aronian");
        fa[5] = new String("Ara Melikyan");
        fa[6] = new String("Jivan Gasparyan");
        fa[7] = new String("Nikol Pashinyan");
        fa[8] = new String("Henrikh Mkhitaryan");
        fa[9] = new String("Arthur Abraham");
        return fa;
    }
    //method for random choosing question from array
    public static String random_armenians(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        return armenians_array()[index];
    }
}
