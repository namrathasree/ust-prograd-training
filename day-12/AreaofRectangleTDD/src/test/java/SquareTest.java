import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;
    @Nested
    class AreaTest {
        @Test
        public void checkAreaIsNineWhenLengthIsThree() {
            square = new Square(3);
            double actualArea = square.area();
            double expectedArea = 9;
            assertEquals(expectedArea, actualArea);
        }
        @Test
        public void checkAreaIsSixteenWhenLengthIsFour() {
            square = new Square(4);
            double actualArea = square.area();
            double expectedArea = 16;
            assertEquals(expectedArea, actualArea);
        }
        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwo(){

            assertThrows(IllegalArgumentException.class, () -> new Square(-2));
        }
    }

    @Nested
    class PerimeterTest{
        @Test
        public void checkPerimeterIsEightWhenLengthIsTwo(){
            square=new Square(2);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 8;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsFourWhenLengthIsOne(){
            square=new Square(1);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 4;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwo(){

            assertThrows(IllegalArgumentException.class, () -> new Square(-2));
        }
    }
}