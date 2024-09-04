package Set.OrdancaoComMap.EventSchedulerExample;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EventSchedule {
    private static Map<LocalDate, Event> eventSchedule = new HashMap<LocalDate,Event>();

    public static Map<LocalDate, Event> getEventSchedule() {
        return eventSchedule;
    }

    public static void addEvent(LocalDate date, Event event) {
        eventSchedule.put(date, event);
    }

    public static void showScheduledEvents(){
        eventSchedule.forEach((k,v)-> System.out.printf(k + ": " + v));
    }

    public static Optional<Event> getNextEvent(){
        return eventSchedule.entrySet()
                .stream()
                .filter(entry -> entry.getKey().isAfter(LocalDate.now()))
                .sorted(Map.Entry.comparingByKey())
                .findFirst()
                .map(Map.Entry::getValue);
    }
}
