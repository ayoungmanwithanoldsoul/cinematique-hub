package edu.umindanao.cinematiquehub.events;


public class ButtonPressEvent implements Event {
    private static String item;

    public ButtonPressEvent(String item) {
        ButtonPressEvent.item = item;
    }

    public String returnItem() {
        return item;
    }
}
