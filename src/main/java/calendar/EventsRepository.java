package calendar;

import java.util.List;
import java.util.Optional;

public interface EventsRepository {

    List<Event> getAllEvents();

    Optional<Event> getNextEvent();

    void addEvent(Event event);

    void save();
}
