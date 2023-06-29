public class CountVowels {
    public static void main(String[] args) {
        String s="nirmal Singh";
        System.out.println("vowels in your string "+s+" are ");
        CntVwls(s);
    }
    public static void CntVwls(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
            s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||
            s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
             System.out.print(s.charAt(i));
             System.out.print(" ");
            }
          }
    }
}
