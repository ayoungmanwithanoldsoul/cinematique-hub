package edu.umindanao.cinematiquehub.ui.components;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;

public class HorizontalScrollPane extends ScrollPane {

    public HorizontalScrollPane() {
        setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
        setVbarPolicy(ScrollBarPolicy.NEVER);
    }

    @Override
    protected double computeMaxHeight(double width) {
        return Double.MAX_VALUE;
    }

    @Override
    protected double computeMinHeight(double width) {
        return 0;
    }

    @Override
    protected double computePrefHeight(double width) {
        return 0;
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        Node content = getContent();
        if (content != null) {
            content.setTranslateY(getHeight() - content.getBoundsInLocal().getHeight());
        }
    }
}

