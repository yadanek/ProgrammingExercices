package calendar;


import java.util.Optional;
import java.util.Scanner;

public class CalendarService {

    private final String inputDate;
    private EventsRepository eventsRepository;

    public CalendarService(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
        this.inputDate = CalendarProperties.getInstance().getInputDate();
    }

    void printAllEvents(){
        System.out.println(eventsRepository.getAllEvents());

    }

    void helpMessage(){
        System.out.println("help - wypisuje wszystkie obsługiwane polecenia ");
        System.out.println("all events - wypisuje wszystkie wydarzenia ");
        System.out.println("all todos - wypisuje wszystkie rzeczy do zrobienia ");
        System.out.println("next event - wypisuje najblizsze wydarzenie");
        System.out.println(" add - dodaje wydarzenie do kalendarza");;
        System.out.println(" exit - zamyka program");;
    }

    void printNextEvent(){
        Optional<Event> nextEvent = eventsRepository.getNextEvent();
        nextEvent.ifPresent(event -> System.out.println(event));

    }

    void addEvent(){

        System.out.println("podaj nazwę wydarzenia: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Event event = new Event();
        event.setEventName(name);
        System.out.println("podaj datę wydarzenia w formacie: " + inputDate);
        String date = scanner.nextLine();
        event.setDate(date);
        eventsRepository.addEvent(event);
        eventsRepository.save();

    }

    void addToDo(String toDo){

    }
   // List<ToDo_> printToDos(){}

}
