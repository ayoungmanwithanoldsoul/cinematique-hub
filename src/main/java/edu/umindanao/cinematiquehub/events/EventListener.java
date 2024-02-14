package edu.umindanao.cinematiquehub.events;

// ---------------------
// EventListener.java
// ---------------------

/**
 * An interface for handling events of a specific type.
 *
 * @param <T> The type of the event to handle.
 */
public interface EventListener<T extends Event> {

    /**
     * Handles the specified event.
     *
     * @param event The event to handle.
     */
    void handle(T event);
}
