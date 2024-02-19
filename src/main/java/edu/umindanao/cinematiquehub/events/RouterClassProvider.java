package edu.umindanao.cinematiquehub.events;

public class RouterClassProvider implements ClassProvider {
    @Override
    public Class<?> getClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Handle the exception as needed
            return null;
        }
    }
}

