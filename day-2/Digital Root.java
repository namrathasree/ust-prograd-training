public class DRoot {
  public static int digital_root(int n) {
    // ...
    int sum=0;
    while(n>0||sum>9)
      {
      if(n==0)
        {
        n=sum;
        sum=0;
      }
      sum=sum+n%10;
      n=n/10;
    }
    return sum;
  }
}