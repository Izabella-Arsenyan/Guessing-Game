import java.util.Random;
import java.lang.String;
class top_social_media_platforms {
    //    public smp(){}
    public static String[] platforms_array(){
        String[] smp = new String[10];
        smp[0] = new String("Facebook");
        smp[1] = new String("YouTube");
        smp[2] = new String("WhatsApp");
        smp[3] = new String("WeChat");
        smp[4] = new String("Instagram");
        smp[5] = new String("QQ");
        smp[6] = new String("Tumblr");
        smp[7] = new String("Qzone");
        smp[8] = new String("Tik Tok");
        smp[9] = new String("Twitter");
        return smp;
    }
    //method for random choosing question from array
    public static String random_platforms(){
        Random rand = new Random();
        int index = rand.nextInt(10);
        return platforms_array()[index];
    }
}