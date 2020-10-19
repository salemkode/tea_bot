import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class lib {

    static void send(TelegramBot bot, Object chatId , Object message_text) {
        String text = message_text.toString();
        bot.execute(new SendMessage(chatId, text));
    }

    static void send(TelegramBot bot, Object chatId, Object message_text , int replyToMessageId) {
        String text = message_text.toString();
        bot.execute(new SendMessage(chatId, text)
                .replyToMessageId(replyToMessageId));
    }

    static String replay(int index){

        String[] strings = {
                "حاضر",
                "امرك يا معلم " ,
                " كاس "+ lists.ls3[index] + " للمعلم ",
                "ليكها جاهزة",
                "لحظة بتكون عندك",
                "أبشر",
                " وصل كاس ال" + lists.ls3[index]
        };


        Random rand = new Random();

        return strings[rand.nextInt(strings.length - 1 )] + " " + lists.ls2[index];
    }

    static String clear(String input){
        return input.replaceAll("\\s", "");
    }

    static String replace(String input){
        String x = input;
        x = x.replaceAll("ياعبود", "عبود");
        x = x.replaceAll("ة", "ه");
        x = x.replaceAll("القهوه", "قهوه");
        x = x.replaceAll("الشاي", "شاي");
        x = x.replaceAll("البرتقال", "برتقال");
        x = x.replaceAll("اليمون", "ليمون");
        return x;
    }

    static Object[] To_bot(String input){
        Object[] Return = {
                (input.startsWith("عبود") || input.endsWith("عبود"))
                ,
                input.replaceAll("عبود" , "")
        };
        return Return;
    }

    static String ReadFile(String filepath){
        String re = "";
        try {
            String xyz = "";
            File myObj = new File(filepath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                xyz = xyz + "\n" + data;
            }
            re = xyz;
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            //e.printStackTrace();
        }
        return re;
    }

}
