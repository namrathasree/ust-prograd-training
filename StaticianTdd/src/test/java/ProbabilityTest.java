import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    Probability probability=new Probability();
    @Nested
    class TestingProbability{
        @Test
        public void verifyProbabilityOfHeadIsEqualToProbabilityOfTail(){
//            System.out.println(probability.singleToss("H"));
            double headProbability=probability.checkProbabilityValue("H");
            double tailProbability=probability.checkProbabilityValue("T");
            assertEquals(tailProbability,headProbability);
        }
        @Test
        public void verifyProbabilityOfTwoHeadsOccurringTogether(){
            double actualProbability=probability.checkProbabilityValue("HH");
            double expectedProbability=0.25;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void verifyProbabilityOfTwoTailsOccurringTogether(){
            double actualProbability=probability.checkProbabilityValue("TT");
            double expectedProbability=0.25;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void verifyProbabilityOfEventsNotOccurringWithHead(){
//            System.out.println(probability.singleToss("H"));
            double actualProbability=1- (probability.checkProbabilityValue("H"));
            double expectedProbability=0.5;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void verifyProbabilityOfEventsNotOccurringWithTail(){
            double actualProbability=1- probability.checkProbabilityValue("T");
            double expectedProbability=0.5;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void verifyProbabilityOfEitherTwoEventsOccurring(){
            double actualProbability=probability.checkProbabilityValue("H")+ probability.checkProbabilityValue("T")-probability.checkProbabilityValue("HT");
            double expectedProbability=0.75;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void throwExceptionWhenInputIsZero(){
            assertThrows(IllegalArgumentException.class,()->probability.checkProbabilityValue("0"));
        }
        @Test
        public void throwExceptionWhenInputIsOne(){
            assertThrows(IllegalArgumentException.class,()->probability.checkProbabilityValue("1"));
        }
    }
}
//As a statistician, I want to be able to know that the probability of a heads in a coin toss is equal to the probability
// of a tails in a coin toss.
// As a statistician, I want to be able to know the probability of two events occurring together.
// As a statistician, I want to be able to know the probability of an event not occurring.
// As a statistician, I want to be able to know the probability of either two events occurring.
