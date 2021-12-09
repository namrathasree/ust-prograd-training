import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArchitectTest {
    Architect architect;
    @Nested
    class TestCentimeter{

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter(){
            architect = new Architect(1);
            double actual= architect.meterToCentimeter();
            double expected=100;
            assertEquals(expected,actual);

        }

        @Test
        public void checkHundredCentimeterIsEqualToPointZeroZeroOneKilometer(){
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

    @Nested
    class AddingOfMagnitudes{

        @Test
        public void checkIfAdditionOfOneMeterAndHundredCentimetersGivesTwoMeters() {
            architect =new Architect(1,100);
            double actualMagnitude = architect.addingOfMeterAndCentimeterGivesMeter();
            double expectedMagnitude = 2;
            assertEquals(expectedMagnitude,actualMagnitude);
        }
        @Test
        public void checkIfAdditionOfHundredCentimeterAndOneKilometerGivesOneLakhTwoHundredCentimeters() {
            architect =new Architect(200,1);
            double actualMagnitude = architect.addingOfCentimeterAndKilometerGivesCentimeter();
            double expectedMagnitude = 100200;
            assertEquals(expectedMagnitude,actualMagnitude);
        }
    }

    @Nested
    class SubtractingOfMagnitudes{
        @Test
        public void checkIfSubtractionOfOneMeterAndFiftyCentimeterGivesZeroPointFiveMeters(){
            architect =new Architect(1,50);
            double actualMagnitude = architect.subtractingMeterAndCentimeterGivesMeter();
            double expectedMagnitude =0.5;
            assertEquals(expectedMagnitude,actualMagnitude);
        }
        @Test
        public void checkIfSubtractionOfTwoThousandCentimeterAndOneMeterGivesNineteenHundredCentimeters(){
            architect =new Architect(2000,1);
            double actualMagnitude = architect.subtractingCentimeterAndMetereterGivesCentieter();
            double expectedMagnitude =1900;
            assertEquals(expectedMagnitude,actualMagnitude);
        }

    }

}
