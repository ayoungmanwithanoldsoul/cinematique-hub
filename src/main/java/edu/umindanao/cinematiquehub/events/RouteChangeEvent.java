package edu.umindanao.cinematiquehub.events;

// ---------------------
// RouteChangeEvent.java
// ---------------------

/**
 * An event representing a change in the application route.
 */
public class RouteChangeEvent implements Event {

    //    private final Class<?> destination;
    private final ClassProvider classProvider;
    private final String destinationClassName;

    /**
     * Constructs a RouteChangeEvent with the specified destination class.
     *
     * @param destinationClassName The class representing the destination route.
     */
    public RouteChangeEvent(ClassProvider classProvider, String destinationClassName) {
        this.classProvider = classProvider;
        this.destinationClassName = destinationClassName;
    }

    /**
     * Gets the class representing the destination route.
     *
     * @return The destination class.
     */
    public Class<?> getDestination() {
        return classProvider.getClass(destinationClassName);
    }
}