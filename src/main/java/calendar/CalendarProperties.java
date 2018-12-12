package calendar;


import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Log4j2
public class CalendarProperties {
    private static final CalendarProperties instance = new CalendarProperties();
    private String eventsPath;
    private String todosPath;
    private String inputDate;
    private String outputDate;

    //SINGLETON:
    public static CalendarProperties getInstance(){
        return instance;
    }
    private CalendarProperties(){
        loadProperties();
    }

    private void loadProperties() {
        String filename = "calendar.properties";
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }
            //load a properties file from class path, inside static method
            Properties prop = new Properties();
            prop.load(input);
            eventsPath = prop.getProperty("path.events.file");
            todosPath = prop.getProperty("path.todos.file");
            inputDate = prop.getProperty("inputDatePattern");
            outputDate = prop.getProperty("outputDatePattern");


        } catch (IOException ex) {
            log.error(ex.getMessage(), ex);
        }

    }


    public String getEventsPath() {
        loadProperties();
        return eventsPath;
    }

    public String getTodoPath() {
        loadProperties();
        return todosPath;
    }
    public String getInputDate() {
        loadProperties();
        return inputDate;
    }

    public String getOutputDate() {
        loadProperties();
        return outputDate;
    }


}
