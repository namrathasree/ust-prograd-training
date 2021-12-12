import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LengthConverterTest {
    LengthConverter lengthConverter = new LengthConverter();

    @Nested
    class MeterToCentimeterTest {

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter() {
            double actual = lengthConverter.meterToCentimeter(1);
            double expected = 100;
            assertEquals(expected, actual);

        }
    }

    @Nested
    class CentimeterToKilometerTest {
        @Test
        public void checkHundredCentimeterIsEqualToPointZeroZeroOneKilometer() {
            double actual = lengthConverter.centimeterToKilometer(100);
            double expected = 0.001;
            assertEquals(expected, actual);

        }
    }

    @Nested
    class CentimeterToCentimeterTest {
        @Test
        public void checkHundredCentimeterIsEqualToHundredCentimeter() {
            double actual = lengthConverter.centimeterToCentimeter(100);
            double expected = 100;
            assertEquals(expected, actual);

        }
    }
//        @Test
//        public void checkErrorIfValueIsZero(){
//
//            assertThrows(IllegalArgumentException.class, () -> new Architect(0));
//        }
//        @Test
//        public void checkErrorIfValueIsMinusOne(){
//
//            assertThrows(IllegalArgumentException.class, () -> new Architect(-1));
//        }


    @Nested
    class AddingOfMagnitudes {
        @Test
        public void checkIfAdditionOfOneMeterAndHundredCentimetersGivesTwoMeters() {
            double actualMagnitude = 1 + lengthConverter.centimeterToMeter(100);
            double expectedMagnitude = 2;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfAdditionOfTwoHundredCentimeterAndOneKilometerGivesOneLakhTwoHundredCentimeters() {
            double actualMagnitude = 200 + lengthConverter.kilometerToCentimeter(1);
            double expectedMagnitude = 100200;
            assertEquals(expectedMagnitude, actualMagnitude);
        }
    }

    @Nested
    class SubtractingOfMagnitudes {
        @Test
        public void checkIfSubtractionOfOneMeterAndFiftyCentimeterGivesZeroPointFiveMeters() {
            double actualMagnitude = 1 - lengthConverter.centimeterToMeter(50);
            double expectedMagnitude = 0.5;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

        @Test
        public void checkIfSubtractionOfTwoThousandCentimeterAndOneMeterGivesNineteenHundredCentimeters() {
            double actualMagnitude = 2000 - lengthConverter.meterToCentimeter(1);
            double expectedMagnitude = 1900;
            assertEquals(expectedMagnitude, actualMagnitude);
        }

    }
}
