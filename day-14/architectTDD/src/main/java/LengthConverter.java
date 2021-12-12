public class LengthConverter {
//    public Architect(double value)
//    {
//        if(value<=0)
//        {
//            throw new IllegalArgumentException("Meter cannot be zero or negative");
//        }
//        this.value=value;
//    }
//    public double magnitude1;
//    public double magnitude2;
//    public Architect(double magnitude1,double magnitude2)
//    {
//        if(magnitude1<=0 || magnitude2<=0)
//        {
//            throw new NullPointerException("Magnitude cannot be zero or negative");
//        }
//        this.magnitude1=magnitude1;

//        this.magnitude2=magnitude2;
//    }

    public double meterToCentimeter(double lengthInMeter)
    {
        return lengthInMeter*100;
    }
    public double centimeterToMeter(double lengthInCentimeter)
    {
        return lengthInCentimeter/100;
    }
    public double centimeterToKilometer(double lengthInCentimeter){
        return lengthInCentimeter/100000;
    }
    public double kilometerToCentimeter(double lengthInKilometer)
    {
        return lengthInKilometer*100000;
    }
    public double centimeterToCentimeter(double lengthInCentimeter)
    {
        return lengthInCentimeter;
    }


//    public double addingOfMeterAndCentimeterGivesMeter(){
//        return magnitude1+(magnitude2/100);
//
//    }
//    public double addingOfCentimeterAndKilometerGivesCentimeter(){
//        return magnitude1+(magnitude2*100000);
//    }
//    public double subtractingMeterAndCentimeterGivesMeter(){
//        return magnitude1-(magnitude2/100);
//    }
//
//    public double subtractingCentimeterAndMetereterGivesCentieter() {
//        return magnitude1-(magnitude2*100);
//    }
}
