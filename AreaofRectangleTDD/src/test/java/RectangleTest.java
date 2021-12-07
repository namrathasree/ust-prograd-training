import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rect;

    @BeforeEach
    public void setup() {
        rect = new Rectangle();
    }

    @Nested
    class TestingAreaOfRectangle {
        @BeforeEach
        public void setup() { rect = new Rectangle(); }
        @Test
        public void AreaOfRectangleWithLengthFiveAndBreadthTenIsFifty() {
            double answer = rect.area(5, 10);
            double expected = 50;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void AreaOfRectangleWithLengthTwoAndBreadthFiveIsTen() {
            double answer = rect.area(2,5);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenLengthAndBreadthAreEqual() {
            Assertions.assertThrows(ArithmeticException.class, () ->rect.area(5,5));
        }
        @Test
        public void throwsExceptionWhenLengthIsZero() {
            Assertions.assertThrows(ArithmeticException.class, () ->rect.area(0,5));
        }
        @Test
        public void throwsExceptionWhenBreadthIsZero() {
            Assertions.assertThrows(ArithmeticException.class, () ->rect.area(5,0));
        }
    }
}
