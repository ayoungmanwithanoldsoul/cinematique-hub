package edu.umindanao.cinematiquehub.events;


import javafx.event.Event;
import javafx.event.EventType;

public class ContentUpdateEvent extends Event {

    public static final EventType<ContentUpdateEvent> UPDATE_CONTENT = new EventType<>(Event.ANY, "UPDATE_CONTENT");

    public ContentUpdateEvent() {
        super(UPDATE_CONTENT);
    }
}
