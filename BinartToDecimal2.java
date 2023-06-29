public class BinartToDecimal2 {
    public static int binaryToDecimal(long binary){
        int i=0;
        int dec=0;
        while(binary>0){
            dec+=Math.pow(2, i++)*binary%10;
            binary/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
       int decimalNo=binaryToDecimal(1010001);
       String octalstring=Integer.toOctalString(decimalNo);
       int octNo=Integer.parseInt(octalstring);
       System.out.println("octal no is "+octNo);
       System.out.println(decimalNo); 
    }
}
