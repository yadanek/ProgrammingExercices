package calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingOfDate {
    private final String inputDate;
    private final String outputDate;
    CalendarProperties cal = CalendarProperties.getInstance();

    public HandlingOfDate() {
        this.outputDate = cal.getOutputDate();
        this.inputDate = cal.getInputDate();
    }

    LocalDateTime readInputData(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inputDate);
        LocalDateTime localDate = LocalDateTime.parse(date, formatter);
        return localDate;
    }

    void printOutputData(){
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(outputDate);
    }
}
