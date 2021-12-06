
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }
    @Nested
    class TestingAddFunctions {
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }
        @Test
        public void FivePlusThreeIsEight() {
            double answer=calc.add(5,3);
            double expected=8;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void FivePlusFiveIsTen() {
            double answer=calc.add(5,5);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class TestingSubFunctions {
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }
        @Test
        public void FiveMinusThreeIsTwo() {
            double answer=calc.sub(5,3);
            double expected=2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void FiveMinusOneIsFour() {
            double answer=calc.sub(5,1);
            double expected=4;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    class TestingMulFunctions {
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }
        @Test
        public void FiveMultiplyingThreeIsFifteen() {
            double answer=calc.mul(5,3);
            double expected=15;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void FiveMultiplyingTwoIsTen() {
            double answer=calc.mul(5,2);
            double expected=10;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class TestingDivFunctions {
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }
        @Test
        public void TenDividedByTwoIsFive() {
            double answer=calc.div(10,2);
            double expected=5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void throwsExceptionWhenDividedByZero() {
            Assertions.assertThrows(ArithmeticException.class, () ->calc.div(5,0));

        }
    }


}
