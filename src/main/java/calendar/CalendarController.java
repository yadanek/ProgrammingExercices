package calendar;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalendarController {

    private CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }


    void evaluate(String instruction){
        String string = instruction.toLowerCase().trim();
        Pattern pattern = Pattern.compile("((\\S+) (.*))");
        Matcher matcher = pattern.matcher(string);
        String order = "help";
        String value = "";
        if(matcher.find()){
            order = matcher.group(1);
            value = matcher.group(2);

        }

        switch (order){
            case "help":{
                calendarService.helpMessage();
                break;
            }
            case "all": {
                if(value.equals("events")){
                    calendarService.printAllEvents();
                }
                if(value.equals("todos")){
                    //tu będzie calendarService.printAllTodos
                }
                break;
            }
            case "next": {
                calendarService.printNextEvent();
                break;
            }
            case "add": {
                calendarService.addEvent();
            }
            case "exit": {
                System.exit(-1);
            }
        }
    }


}
