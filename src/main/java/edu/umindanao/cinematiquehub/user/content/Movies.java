package edu.umindanao.cinematiquehub.user.content;

import edu.umindanao.cinematiquehub.controllers.MovieCardController;
import edu.umindanao.cinematiquehub.ui.components.HorizontalCarousel;
import edu.umindanao.cinematiquehub.ui.components.HoverCard;
import javafx.scene.layout.VBox;

public class Movies extends VBox {

    public Movies() {
        VBox vBox = new VBox();
        HorizontalCarousel carousel = new HorizontalCarousel();
        carousel.setPrefSize(1500, 400);

        HoverCard[] hoverCards = new HoverCard[20];
        MovieCardController[] movieCardControllers = new MovieCardController[20];
        for (int i = 0; i < 10; i++) {
            hoverCards[i] = new HoverCard();
            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
            movieCardControllers[i].initialize(null, null);
            getChildren().add(hoverCards[i]);
        }

        getChildren().add(carousel);
//        return v

    }

/*    public VBox testRun() {
        VBox vBox = new VBox();

        HoverCard[] hoverCards = new HoverCard[20];
        MovieCardController[] movieCardControllers = new MovieCardController[20];
        for (int i = 0; i < 10; i++) {
            hoverCards[i] = new HoverCard();
            movieCardControllers[i] = new MovieCardController(hoverCards[i]);
            movieCardControllers[i].initialize(null, null);
            vBox.getChildren().add(hoverCards[i]);
        }

        return vBox;
    }*/
}
