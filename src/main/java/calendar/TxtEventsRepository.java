package calendar;

import java.io.File;
import java.util.List;
import java.util.Optional;

public class TxtEventsRepository implements EventsRepository {

    public TxtEventsRepository(File file) {
    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public Optional<Event> getNextEvent() {
        return null;
    }

    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void save() {

    }


}
