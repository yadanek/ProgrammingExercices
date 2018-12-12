package calendar;

import java.io.File;

public class RepositoryFactory {

    public static EventsRepository createEventRepository(String eventFilePath){
        File file = new File(eventFilePath);
        if (file.getName().endsWith(".xml")) {

            return new XmlEventsRepository(file);
        } else {
            return new TxtEventsRepository(file);
        }
    }
    public static TodoRepository createTodoRepository(String todoFilePath){
        File file = new File(todoFilePath);
        if (file.getName().endsWith(".xml")) {

            return new XmlTodoRepository(file);
        } else {
            return new TxtTodoRepository(file);
        }
    }
}
