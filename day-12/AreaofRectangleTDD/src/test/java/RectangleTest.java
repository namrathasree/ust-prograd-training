import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectanglesTest {
    Rectangle rectangle;
    @Nested
    class TestArea{

        @Test
        public void checkAreaIsTenWhenLengthIsThreeAndBreadthIsFive(){
            rectangle=new Rectangle(3,5);
            double actualArea = rectangle.area();
            double expectedArea = 15;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void checkAreaIsTenWhenLengthIsTwoAndBreadthIsFive(){
            rectangle=new Rectangle(2,5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea , actualArea);
        }

        @Test
        public void checkAreaIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }

    }

    @Nested
    class TestPerimeter{

        @Test
        public void checkPerimeterIsFourteenWhenLengthIsTwoAndBreadthIsFive(){
            rectangle=new Rectangle(2,5);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter , actualPerimeter);
        }
        @Test
        public void checkPerimeterIsSixteenWhenLengthIsTwoAndBreadthIsThree(){
            rectangle=new Rectangle(2,3);
            double actualArea = rectangle.perimeter();
            double expectedArea = 10;
            assertEquals(expectedArea , actualArea);
        }
        @Test
        public void checkPerimeterIsErrorWhenLengthIsMinusTwoAndBreadthIsFive(){

            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,5));
        }
    }

}