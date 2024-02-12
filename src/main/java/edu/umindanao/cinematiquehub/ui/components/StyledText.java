package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.effect.Effect;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/**
 * A Custom component to create display texts to the user <p>
 * Usage:
 * <pre><code>StyledText styledText = new StyledText("Hello, World!");</code></pre>
 * or without parameters<p>
 * <code><pre>StyledText styledText = new StyledText();</pre></code>
 * <code>
 * <pre>
 * styledText.setColor(Color.BLUE);
 * styledText.setEffect(new DropShadow());
 * styledText.setFontSize(20);
 * styledText.setFont("Arial");
 * styledText.setBold(true);
 * styledText.setItalic(true);
 * </pre>
 * </code>
 */
public class StyledText extends StackPane {

    private Text text;
    private boolean bold;
    private boolean italic;

    public StyledText(String initialText) {
        text = new Text(initialText);
        getChildren().add(text);
        bold = false;
        italic = false;
    }

    public StyledText() {
        text = new Text();
        getChildren().add(text);
        bold = false;
        italic = false;
    }

    public void setColor(Color color) {
        text.setFill(color);
    }

    public void applyEffect(Effect effect) {
        text.setEffect(effect);
    }

    public void setFontSize(double fontSize) {
        text.setFont(Font.font(text.getFont().getFamily(), FontWeight.NORMAL, FontPosture.REGULAR, fontSize));
    }

    public void setFont(String fontFamily) {
        text.setFont(Font.font(fontFamily, FontWeight.NORMAL, FontPosture.REGULAR, text.getFont().getSize()));
    }

    public void setBold(boolean bold) {
        this.bold = bold;
        updateFont();
    }

    public void setItalic(boolean italic) {
        this.italic = italic;
        updateFont();
    }

    private void updateFont() {
        FontWeight weight = bold ? FontWeight.BOLD : FontWeight.NORMAL;
        FontPosture posture = italic ? FontPosture.ITALIC : FontPosture.REGULAR;
        text.setFont(Font.font(text.getFont().getFamily(), weight, posture, text.getFont().getSize()));
    }

    public void setText(String newText) {
        text.setText(newText);
    }
}
