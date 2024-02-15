package edu.umindanao.cinematiquehub.utils;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * ViewportUnitsHelper provides methods to calculate dimensions based on
 * a percentage of the current scene's width and height, mimicking the
 * behavior of CSS's vw and vh units.
 * <br>
 * Example Usage:
 * <br>
 * Example 1: Setting Scene Manually
 * {@code
 * Scene scene = new Scene(yourRootNode, 800, 600);
 * ViewportUnitsHelper.setCurrentScene(scene);
 * <br>
 * double widthInViewport1 = ViewportUnitsHelper.getWidthInViewportUnits(50);
 * double heightInViewport1 = ViewportUnitsHelper.getHeightInViewportUnits(25);
 * <br>
 * System.out.println("Example 1:");
 * System.out.println("Width in 50vw: " + widthInViewport1);
 * System.out.println("Height in 25vh: " + heightInViewport1);
 * System.out.println();
 * }
 * <br>
 * Example 2: Setting Scene Automatically from Stage
 * {@code
 * Stage primaryStage = new Stage();
 * Scene anotherScene = new Scene(anotherRootNode, 1200, 800);
 * primaryStage.setScene(anotherScene);
 * <br>
 * ViewportUnitsHelper.setStage(primaryStage);
 * <br>
 * double widthInViewport2 = ViewportUnitsHelper.getWidthInViewportUnits(30);
 * double heightInViewport2 = ViewportUnitsHelper.getHeightInViewportUnits(75);
 * <br>
 * System.out.println("Example 2:");
 * System.out.println("Width in 30vw: " + widthInViewport2);
 * System.out.println("Height in 75vh: " + heightInViewport2);
 * }
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
     * Calculate the width in viewport units based on the provided percentage.
     *
     * @param percentage The percentage of the current scene's width.
     * @return The calculated width in viewport units.
     * @throws IllegalStateException If the current scene is not set. Call setCurrentScene() or setStage() first.
     */
    public static double getWidthInViewportUnits(double percentage) {
        if (currentScene == null) {
            throw new IllegalStateException("Current scene not set. Call setCurrentScene() or setStage() first.");
        }

        return currentScene.getWidth() * (percentage / 100.0);
    }

    /**
     * Calculate the height in viewport units based on the provided percentage.
     *
     * @param percentage The percentage of the current scene's height.
     * @return The calculated height in viewport units.
     * @throws IllegalStateException If the current scene is not set. Call setCurrentScene() or setStage() first.
     */
    public static double getHeightInViewportUnits(double percentage) {
        if (currentScene == null) {
            throw new IllegalStateException("Current scene not set. Call setCurrentScene() or setStage() first.");
        }

        return currentScene.getHeight() * (percentage / 100.0);
    }
}
