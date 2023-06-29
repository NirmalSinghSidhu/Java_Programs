public class BinaryToOctal {
  public static int binaryToDecimal(long binary){
    int decimal=0;
    int i=0;
    while(binary>0){
        decimal+=Math.pow(2, i)*binary%10;
        i++;
        binary/=10;
    }
    return decimal;
  }
  public static int decimalToOctal(int decimal){
    int octal=0;
    int i=0;
    while(decimal>0){
      octal+=Math.pow(10, i++)*(decimal%8);
      decimal/=8;
    }
    return octal;
  }
  public static void main(String[] args) {
    int d=binaryToDecimal(101001001);
    int o=decimalToOctal(d);
    System.out.println(d);
    System.out.println(o);
  }
}

