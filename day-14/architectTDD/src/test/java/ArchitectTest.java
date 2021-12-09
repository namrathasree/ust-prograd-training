import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArchitectTest {
    Architect architect;
    @Nested
    class TestCentimeter{

        @Test
        public void checkOneMeterIsEqualToCentimeter(){
            architect = new Architect(1);
            double actual= architect.meterToCentimeter();
            double expected=100;
            assertEquals(expected,actual);

        }

        @Test
        public void checkHundredCentimeterIsEqualToZeroZeroZeroOneKilometer(){
            architect = new Architect(100);
            double actual= architect.centimeterToKilometer();
            double expected=0.001;
            assertEquals(expected,actual);

        }
        @Test
        public void checkHundredCentimeterIsEqualToHundredCentimeter(){
            architect = new Architect(100);
            double actual= architect.centimeterToCentimeter();
            double expected=100;
            assertEquals(expected,actual);

        }
        @Test
        public void checkErrorIfValueIsZero(){

            assertThrows(IllegalArgumentException.class, () -> new Architect(0));
        }
        @Test
        public void checkErrorIfValueIsMinusOne(){

            assertThrows(IllegalArgumentException.class, () -> new Architect(-1));
        }
    }

}
