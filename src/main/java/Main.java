
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.Update;

import java.util.List;

public class Main {

    static String input ;

    static TelegramBot bot = new TelegramBot( lib.ReadFile("src/main/resources/key.txt") );


    public static void main(String[] args) {

        lists.run();

        bot.setUpdatesListener(new UpdatesListener() {
            
            public int process(List<Update> updates) {

                for (Update update : updates) {

                    Message message = update.message();

                    if (    message != null
                            &&
                            message.text() != null) {

                        input = lib.clear(message.text());

                        input = lib.replace(input);

                        Object[] x = lib.To_bot(input);
                        input = x[1].toString();
                        boolean xyz = Boolean.parseBoolean(x[0].toString());

                        if ( lists.drinking.contains(input) && xyz) {
                            int index = lists.drinking.indexOf(input);
                            lib.send(bot , message.chat().id() , lib.replay(index) , message.messageId());
                        }else if (input.startsWith("/about")) {
                            lib.send(bot , message.chat().id() , lib.ReadFile("src/main/resources/about.txt") , message.messageId());
                        }
                    }

                }
                return UpdatesListener.CONFIRMED_UPDATES_ALL ;
            }
        });
    }
}







