package calendar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OrderEvaluator {

    /*
    - help - wypisyje liste dostępnych operacji
        - next event - najbliższe wydarzenie
        - all events - wszystkie wydarzenia
        - ADD 26012018 3:45 Nazwa wydarzenia - zapis eventu do pliku
        - TODOs Nazwa zadania - zapisz nowe zadanie
        - all todos
     */

    void loadOrder(String order){
        Pattern pattern = Pattern.compile("(\\S+) ([^&]+)&(.*)");
        Matcher matcher = pattern.matcher(order);
        if(matcher.find()){
            String instruction = matcher.group(1);
            String date = matcher.group(2);
            String event = matcher.group(3);
        }
    }
}
