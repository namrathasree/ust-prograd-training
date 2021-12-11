public class ShadesOfGrey {
  static String[] shadesOfGrey(int num) {
    // returns n shades of grey in an array
    if(num<0){
      return new String[0];
    }
    if(num>254){
      num=254;
    }
    String[] shades = new String[num];
      int i=0;
    while(i<num){
      i++;
      String s=Integer.toHexString(i);
      if(s.length()==1){
        s="0"+s;
      }
      shades[i-1]="#" +s +s +s;
    }
    return shades;
  }
}