package calendar;


import lombok.Data;

import javax.xml.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@XmlType(name = "event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

    @XmlAttribute(name = "date")
    private String date;
    @XmlValue
    private String eventName;

    public LocalDateTime getDate() {
        HandlingOfDate aboutDate = new HandlingOfDate();
        return aboutDate.readInputData(date);
    }



    @Override
    public String toString() {
        String outputDatePattern = CalendarProperties.getInstance().getOutputDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(outputDatePattern);
        return getDate().format(formatter) + " - " + eventName;
    }
}
