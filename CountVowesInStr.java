public class CountVowesInStr {
    public static void main(String[] args) {
        String k="aebhjyreinjiond";
        Vowel v=new Vowel(k);
        System.out.println("Vowels appear "+v.count+" times in your String "+" '"+k+"'");
    }
}
class Vowel{
    String s;
    int count=0;
    public Vowel(String s){
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
          s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
          s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
           count++;
          }
        }
    }
}
