package edu.umindanao.cinematiquehub.events;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// ---------------------
// EventBus.java
// ---------------------

/**
 * A simple event bus implementation for handling events in a JavaFX application.
 */
public class EventBus {

    private static Map<Class, List<EventListener>> listeners = new HashMap<>();

    /**
     * Emits an event to all registered listeners of that event type.
     *
     * @param event The event to emit.
     */
    public static void emit(Event event) {
        Class eventClass = event.getClass();
        List<EventListener> eventListeners = listeners.get(eventClass);
        for (EventListener eventListener : eventListeners) {
            eventListener.handle(event);
        }
    }

    /**
     * Registers a listener to receive events of a specific type.
     *
     * @param eventClass The class of the event to listen for.
     * @param listener   The listener to register.
     * @param <T>        The type of the event.
     */
    public static <T extends Event> void listenFor(Class<T> eventClass, EventListener<T> listener) {
        if (!listeners.containsKey(eventClass)) {
            listeners.put(eventClass, new LinkedList<>());
        }

        listeners.get(eventClass).add(listener);
    }

}

// version by chatgpt:
// EventBus.java
/*
package edu.umindanao.cinematiquehub.events;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EventBus {

    private static Map<Class, List<EventListener>> listeners = new HashMap<>();

    private EventBus() {
        // Private constructor to prevent instantiation
    }

    public static void emit(Event event) {
        Class eventClass = event.getClass();
        List<EventListener> eventListeners = listeners.get(eventClass);
        if (eventListeners != null) {
            for (EventListener eventListener : eventListeners) {
                eventListener.handle(event);
            }
        }
    }

    public static <T extends Event> void listenFor(Class<T> eventClass, EventListener<T> listener) {
        List<EventListener> eventListeners = listeners.get(eventClass);
        if (eventListeners == null) {
            eventListeners = new LinkedList<>();
            listeners.put(eventClass, eventListeners);
        }

        eventListeners.add(listener);
    }
}
*/

