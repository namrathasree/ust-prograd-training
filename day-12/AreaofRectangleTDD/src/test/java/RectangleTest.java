import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setup() {
        rectangle = new Rectangle();
    }

    @Nested
    class TestingAreaOfRectangle {
        @BeforeEach
        public void setup() { rectangle = new Rectangle(); }
        @Test
        public void areaOfRectangleWithLengthFiveAndBreadthTenIsFifty() {
            double answer = rectangle.area(5, 10);
            double expected = 50;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void areaOfRectangleWithLengthTwoAndBreadthFiveIsTen() {
            double answer = rectangle.area(2,5);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenLengthAndBreadthAreEqual() {
            Assertions.assertThrows(Exception.class, () ->rectangle.area(5,5));
        }
        @Test
        public void throwsExceptionWhenLengthIsZeroAndBreadthIsFive() {
            Assertions.assertThrows(Exception.class, () ->rectangle.area(0,5));
        }
        @Test
        public void throwsExceptionWhenLengthIsFiveAndBreadthIsZero() {
            Assertions.assertThrows(Exception.class, () ->rectangle.area(5,0));
        }
    }

    @Nested
    class TestingPerimeterOfRectangle {
        @BeforeEach
        public void setup() { rectangle = new Rectangle(); }
        @Test
        public void perimeterOfRectangleWithLengthTwoAndBreadthFiveIsFourteen() {
            double answer=rectangle.perimeter(2,5);
            double expected=14;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void perimeterOfRectangleWithLengthThreeAndBreadthFiveIsSixteen() {
            double answer=rectangle.perimeter(3,5);
            double expected=16;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenLengthAndBreadthAreFive() {
            Assertions.assertThrows(Exception.class, () ->rectangle.perimeter(5,5));
        }
        @Test
        public void throwsExceptionWhenLengthIsZeroAndBreadthIsFive() {
            Assertions.assertThrows(Exception.class, () ->rectangle.perimeter(0,5));
        }
        @Test
        public void throwsExceptionWhenLengthIsFiveAndBreadthIsZero() {
            Assertions.assertThrows(Exception.class, () ->rectangle.perimeter(5,0));
        }

    }
}
