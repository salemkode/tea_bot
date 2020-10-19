import java.util.ArrayList;
import java.util.Arrays;

public class lists {
    static String x = "عصير";
    static String[] ls1 = {
            "قهوه",
            "شاي",
            "عصيربرتقال",
            "عصيرليمون",
    };
    static String[] ls2 ={
            "☕️",
            "\uD83C\uDF75",
            x + "\uD83C\uDF4A",
            x +"\uD83C\uDF4B",
    };
    static String[] ls3 = {
            "قهوه",
            "شاي",
            "البرتقال",
            "اليمون",
    };
    static ArrayList<String> drinking = new ArrayList<String>();
    public static void run(){
        drinking.addAll(Arrays.asList(ls1));
    }

}
