public class Rectangle {
    public double area(double l,double b)
    {
        if(l==b) { throw new ArithmeticException("Length and Breadth cannot be equal"); }
        if(l<=0) { throw new ArithmeticException("Length cannot be zero or negative"); }
        if(b<=0) { throw new ArithmeticException("Breadth cannot be zero or negative"); }
        return l*b;
    }
}
