package com.example;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UtilFigureComparator {

    public static String compareFigures(double a, double b) {

        int result = Double.compare(a, b);
        String answer = "";

        if (result < 0) {
            answer = "Фигура A меньше фигуры B";
        } else if (result > 0) {
            answer = "Фигура A больше фигуры B";
        } else {
            answer = "Фигуры равны";
        }

        return answer;
    }

    public static Optional<Figure> findSmallestByArea(List<Figure> figures) {
        return figures
                .stream()
                .min(Comparator.comparingDouble(Figure::calculateArea));
    }

    public static Optional<Figure> findLargestByArea(List<Figure> figures) {
        return figures
                .stream()
                .max(Comparator.comparingDouble(Figure::calculateArea));
    }

}
