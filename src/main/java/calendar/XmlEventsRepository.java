package calendar;

import javax.xml.bind.JAXB;
import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class XmlEventsRepository implements EventsRepository {
    //wczytać plik xml
    //add event
    //next event
    //all event

    private final AllEvents events;
    private Event nextEvent;
    private File file;


    public XmlEventsRepository(File file) {
        this.file = file;
        events = JAXB.unmarshal(this.file, AllEvents.class);
    }


    @Override
    public List<Event> getAllEvents() {

        return events.getEventList();
    }

    @Override
    public Optional<Event> getNextEvent() {
        LocalDateTime now = LocalDateTime.now();
        long minBetween = Long.MAX_VALUE;
        Event minEvent = null;
        for (Event event : events.getEventList()) {
            LocalDateTime time = event.getDate();
            Duration between = Duration.between(now, time);
            long seconds = between.getSeconds();
            if (!between.isNegative() && seconds < minBetween) {
                minBetween = seconds;
                minEvent = event;
            }
        }

        return Optional.ofNullable(minEvent);
    }

    @Override
    public void addEvent(Event event) {
        events.getEventList().add(event);
    }



    public void save() {
        JAXB.marshal(events, file);
    }
}
