package dmit2015.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleParameterizedTest {

    @ParameterizedTest(name = "Area = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,200",
            "20,20,400",
            "50,50,2500",
    })
    void area(double length, double width, double expectedArea) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setLength(length);
        assertEquals(expectedArea, rectangle.area(), 0.05);
    }

    @ParameterizedTest(name = "Perimeter = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,60",
            "20,20,80",
            "50,50,200",
    })
    void perimeter(double length, double width, double expectedPerimeter) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setLength(length);
        assertEquals(expectedPerimeter, rectangle.perimeter(), 0.05);
    }

    @ParameterizedTest(name = "Diagonal = {2}, Length = {0}, Width = {1}")
    @CsvSource({
            "10,20,22.36",
            "20,20,28.28",
            "50,50,70.71",
    })
    void diagonal(double length, double width, double expectedDiagonal) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(width);
        rectangle.setLength(length);
        assertEquals(expectedDiagonal, rectangle.diagonal(), 0.05);
    }
}