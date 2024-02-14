package edu.umindanao.cinematiquehub.events;

// ---------------------
// RouteChangeEvent.java
// ---------------------

/**
 * An event representing a change in the application route.
 */
public class RouteChangeEvent implements Event {

    private final Class<?> destination;

    /**
     * Constructs a RouteChangeEvent with the specified destination class.
     *
     * @param destination The class representing the destination route.
     */
    public RouteChangeEvent(Class<?> destination) {
        this.destination = destination;
    }

    /**
     * Gets the class representing the destination route.
     *
     * @return The destination class.
     */
    public Class<?> getDestination() {
        return destination;
    }
}