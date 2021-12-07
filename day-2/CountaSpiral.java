import java.math.BigInteger;

class Spiral {
    public static BigInteger sum(BigInteger size) {
      BigInteger answer= size.multiply(size);
      answer=answer.divide(BigInteger.TWO);
      answer=answer.add(size);
      if(answer.mod(BigInteger.TWO)==BigInteger.ZERO)
        answer=answer.subtract(BigInteger.ONE);
      
        return answer;
    }
}