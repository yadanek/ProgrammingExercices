package calendar;


import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        CalendarProperties calendarProperties = CalendarProperties.getInstance();
        String eventsPath = calendarProperties.getEventsPath();
        String todosPath = calendarProperties.getTodoPath();

        EventsRepository eventRepository = RepositoryFactory.createEventRepository(eventsPath);

        CalendarService calendarService = new CalendarService(eventRepository);
        CalendarController calendarController = new CalendarController(calendarService);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String instruction = sc.nextLine();
            calendarController.evaluate(instruction);
        }
    }
}
