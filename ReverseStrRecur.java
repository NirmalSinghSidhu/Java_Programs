import java.util.Scanner;

public class ReverseStrRecur {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        System.out.println(reverse(str));
    }
    public static String reverse(String s){
        if(s.length()==0){
            return " ";
        }
        return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
    }
    
}
