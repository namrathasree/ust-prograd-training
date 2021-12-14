public class Probability {
    String[] doubleToss={"HH","TT","HT","TH"};
    String[] singleToss={"H","T"};
    public double checkProbabilityValue(String inputToss){
        switch(inputToss){
            case "H":
            case "T":return Toss(inputToss,singleToss);
            case "HH":
            case "TT":
            case "HT":
            case "TH":return Toss(inputToss,doubleToss) ;
            default:throw new IllegalArgumentException("Invalid Input");
        }
    }
    public double Toss(String inputToss,String[] possibleArray){
        double count=0;
            for(int i=0;i<possibleArray.length;i++){
                if(possibleArray[i]==inputToss)
                    count++;
            }
            return count/possibleArray.length;
    }
}



//    public double singleToss(String toss) {
//        double count=0;
//        if(toss=="H"||toss=="T"){
//            for(int i=0;i<singleToss.length;i++){
//                if(singleToss[i]==toss)
//                    count++;
//            }
//            return count/singleToss.length;
//        }
//        else
//            throw new IllegalArgumentException("Invalid Input");
//    }
//
//    public double doubleToss(String toss){
//        double count=0;
//        if(toss=="HH"||toss=="HT"||toss=="TH"||toss=="TT"){
//            for(int i=0;i<doubleToss.length;i++){
//                if(doubleToss[i]==toss)
//                    count++;
//            }
//            return count/doubleToss.length;
//        }
//        else
//            throw new IllegalArgumentException("Invalid Input");
//    }
