package edu.umindanao.cinematiquehub.utils;

import javafx.scene.paint.Color;

public class Colors {

    // Common Colors
    public static final Color WHITE = Color.web("#ffffff");
    public static final Color BLACK = Color.web("#000000");
    public static final Color PRIMARY = Color.web("#007bff");
    public static final Color SECONDARY = Color.web("#6c757d");
    public static final Color SUCCESS = Color.web("#28a745");
    public static final Color INFO = Color.web("#17a2b8");
    public static final Color WARNING = Color.web("#ffc107");
    public static final Color DANGER = Color.web("#dc3545");
    public static final Color LIGHT = Color.web("#f8f9fa");
    public static final Color DARK = Color.web("#343a40");

    // Dark Mode Colors
    public static final Color PRIMARY_TEXT_EMPHASIS_DARK = tintColor(PRIMARY, 40);
    public static final Color SECONDARY_TEXT_EMPHASIS_DARK = tintColor(SECONDARY, 40);
    public static final Color SUCCESS_TEXT_EMPHASIS_DARK = tintColor(SUCCESS, 40);
    public static final Color INFO_TEXT_EMPHASIS_DARK = tintColor(INFO, 40);
    public static final Color WARNING_TEXT_EMPHASIS_DARK = tintColor(WARNING, 40);
    public static final Color DANGER_TEXT_EMPHASIS_DARK = tintColor(DANGER, 40);
    public static final Color LIGHT_TEXT_EMPHASIS_DARK = shadeColor(LIGHT, 20);
    public static final Color DARK_TEXT_EMPHASIS_DARK = shadeColor(DARK, 20);

    // Additional Color Combinations
    public static final Color PRIMARY_LIGHT = tint(PRIMARY, 20);
    public static final Color PRIMARY_DARK = shade(PRIMARY, 20);
    public static final Color SECONDARY_LIGHT = tint(SECONDARY, 20);
    public static final Color SECONDARY_DARK = shade(SECONDARY, 20);

    // Accent Colors
    public static final Color ACCENT1 = Color.web("#6a1b9a");
    public static final Color ACCENT2 = Color.web("#ff6f00");
    public static final Color ACCENT3 = Color.web("#00c853");
    public static final Color ACCENT4 = Color.web("#3e4095");
    public static final Color ACCENT5 = Color.web("#d50000");

    // Gradient Colors
    public static final Color GRADIENT1_START = Color.web("#4CAF50");
    public static final Color GRADIENT1_END = Color.web("#FFC107");

    // Additional Color Themes
    public static final Color THEME1_PRIMARY = Color.web("#673AB7");
    public static final Color THEME1_SECONDARY = Color.web("#FFEB3B");
    public static final Color THEME1_ACCENT = Color.web("#FF9800");

    public static final Color THEME2_PRIMARY = Color.web("#E91E63");
    public static final Color THEME2_SECONDARY = Color.web("#2196F3");
    public static final Color THEME2_ACCENT = Color.web("#9C27B0");

    // ... Add more color themes and combinations as needed

    // Utility methods for color manipulations
    private static Color tintColor(Color color, int percentage) {
        // Implement tintColor logic
        return color;
    }

    private static Color shadeColor(Color color, int percentage) {
        // Implement shadeColor logic
        return color;
    }

    private static Color tint(Color color, int percentage) {
        // Implement tint logic
        return color;
    }

    private static Color shade(Color color, int percentage) {
        // Implement shade logic
        return color;
    }
}

