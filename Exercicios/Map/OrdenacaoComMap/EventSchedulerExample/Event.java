package Set.OrdancaoComMap.EventSchedulerExample;

import java.time.LocalDate;

public class Event {
    private String eventName;
    private String mainAttraction;

    public Event(String eventName, String mainAttraction, LocalDate date) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public String getMainAttraction() {
        return mainAttraction;
    }

    @Override
    public String toString() {
        return "Event: [Event Name: %s, Main Attraction: %s]".formatted(eventName, mainAttraction);
    }
}
