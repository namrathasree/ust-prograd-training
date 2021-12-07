public class Rectangle {
    public double area(double l,double b)
    {
        if(l==b) { throw new IllegalArgumentException("Length and Breadth cannot be equal"); }
        if(l<=0) { throw new IllegalArgumentException("Length cannot be zero or negative"); }
        if(b<=0) { throw new IllegalArgumentException("Breadth cannot be zero or negative"); }
        return l*b;
    }
    public double perimeter(double l,double b)
    {
        if(l==b) { throw new IllegalArgumentException("Length and Breadth cannot be equal"); }
        if(l<=0) { throw new IllegalArgumentException("Length cannot be zero or negative"); }
        if(b<=0) { throw new IllegalArgumentException("Breadth cannot be zero or negative"); }
        return 2*(l+b);
    }
}
