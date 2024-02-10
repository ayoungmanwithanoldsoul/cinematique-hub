//package edu.umindanao.cinematiquehub.ui.components;
//
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
//import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.scene.paint.Paint;
//
//public class FontAwesomeButton extends Button {
//
//    private final StackPane iconContainer;
//
//    public FontAwesomeButton(FontAwesomeIcon icon, Paint iconColor, double iconSize) {
//        iconContainer = new StackPane();
//        iconContainer.setMinSize(iconSize, iconSize);
//
//        FontAwesomeIconView iconView = new FontAwesomeIconView(icon);
//        iconView.setSize(String.valueOf(iconSize));
//        iconView.setFill(iconColor);
//
//        iconContainer.getChildren().add(iconView);
//        setGraphic(iconContainer);
//
//        // Apply drop shadow effect on hover
//        setOnMouseEntered(e -> setStyle("-fx-background-color: #e0e0e0;"));
//        setOnMouseExited(e -> setStyle("-fx-background-color: transparent;"));
//    }
//
//    public void setIconColor(Paint iconColor) {
//        ((FontAwesomeIconView) iconContainer.getChildren().get(0)).setFill(iconColor);
//    }
//
//    public void setIconSize(double iconSize) {
//        iconContainer.setMinSize(iconSize, iconSize);
//        ((FontAwesomeIconView) iconContainer.getChildren().get(0)).setSize(String.valueOf(iconSize));
//    }
//}
