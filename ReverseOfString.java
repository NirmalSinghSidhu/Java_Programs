public class ReverseOfString {
    public static void main(String[] args) {
       String k = reverse("my name is mister khan");
       System.out.println("k");
    }
    public static String reverse(String s){
        if(s.length()==0){
            return "";
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
    }
    
}
