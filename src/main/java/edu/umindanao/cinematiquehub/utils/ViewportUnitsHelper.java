package edu.umindanao.cinematiquehub.utils;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * ViewportUnitsHelper provides methods to calculate dimensions based on
 * a percentage of the current scene's width and height, mimicking the
 * behavior of CSS's vw and vh units.
 */
public class ViewportUnitsHelper {

    private static Scene currentScene;

    /**
     * Set the current scene to be used for viewport unit calculations.
     *
     * @param scene The current scene to be used.
     */
    public static void setCurrentScene(Scene scene) {
        currentScene = scene;
    }

    /**
     * Set the stage and extract the current scene from it for viewport unit calculations.
     *
     * @param stage The stage whose scene will be used.
     * @throws IllegalArgumentException If the provided stage is null.
     */
    public static void setStage(Stage stage) {
        if (stage != null) {
            currentScene = stage.getScene();
        } else {
            throw new IllegalArgumentException("Stage cannot be null.");
        }
    }

    /**
     * Set the current scene by extracting it from the provided stage for viewport unit calculations.
     *
     * @param stage The stage whose scene will be set as the current scene.
     * @throws IllegalArgumentException If the provided stage is null.
     */
    public static void setCurrentSceneFromStage(Stage stage) {
        if (stage != null) {
            currentScene = stage.getScene();
        } else {
            throw new IllegalArgumentException("Stage cannot be null.");
        }
    }

    /**
     * Calculate the width in viewport units based on the provided percentage.
     *
     * @param percentage The percentage of the current scene's width.
     * @return The calculated width in viewport units.
     * @throws IllegalStateException If the current scene is not set. Call setCurrentScene(), setStage(), or setCurrentSceneFromStage() first.
     */
    public static double getWidthInViewportUnits(double percentage) {
        if (currentScene == null) {
            throw new IllegalStateException("Current scene not set. Call setCurrentScene(), setStage(), or setCurrentSceneFromStage() first.");
        }

        return currentScene.getWidth() * (percentage / 100.0);
    }

    /**
     * Calculate the height in viewport units based on the provided percentage.
     *
     * @param percentage The percentage of the current scene's height.
     * @return The calculated height in viewport units.
     * @throws IllegalStateException If the current scene is not set. Call setCurrentScene(), setStage(), or setCurrentSceneFromStage() first.
     */
    public static double getHeightInViewportUnits(double percentage) {
        if (currentScene == null) {
            throw new IllegalStateException("Current scene not set. Call setCurrentScene(), setStage(), or setCurrentSceneFromStage() first.");
        }

        return currentScene.getHeight() * (percentage / 100.0);
    }
}
