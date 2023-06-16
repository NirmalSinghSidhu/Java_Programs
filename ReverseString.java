import java.util.Scanner;
public class ReverseString {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the String");
        String a=s.nextLine();
        System.out.println("Reverse of the String is"+ReverseString.reverse(a));
    
    }
    public static String reverse(String s1){
        String rev="";
        for(int j=s1.length();j>0;j--){
            rev=rev+s1.charAt(j-1);
        }
        return rev;
    }
}
