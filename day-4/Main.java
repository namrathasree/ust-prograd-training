class Rectangle{

    public double length;
    public double breadth;
    public double area()
    {

        return length*breadth;
    }
}

class Cuboid extends Rectangle{
    public double height;

    public double volume()

    {
        return area()*height;
    }
}

public class Main {
    public static void main(String[] args) {

        Cuboid cuboid = new Cuboid();
        cuboid.length = 2;
        cuboid.breadth = 5;
        cuboid.height = 10;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
