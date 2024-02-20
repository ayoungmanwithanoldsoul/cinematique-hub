package edu.umindanao.cinematiquehub.events;

// RouteChangeEvent.java
//package edu.umindanao.cinematiquehub.events;

public class RouteChangeEvent2 implements Event {

    private final ClassProvider classProvider;
    private final String destinationClassName;

    public RouteChangeEvent2(ClassProvider classProvider, String destinationClassName) {
        this.classProvider = classProvider;
        this.destinationClassName = destinationClassName;
    }

    public Class<?> getDestination() {
        return classProvider.getClass(destinationClassName);
    }
}
