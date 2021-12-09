public class Architect {
    double value;
    public Architect(double value)
    {
        if(value<=0)
        {
            throw new IllegalArgumentException("Meter cannot be zero or negative");
        }
        this.value=value;
    }

    public double meterToCentimeter()
    {
        return value*100;
    }
    public double centimeterToKilometer(){
        return value/100000;
    }
    public double centimeterToCentimeter()
    {
        return value;
    }

}
