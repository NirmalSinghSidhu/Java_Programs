import java.util.Scanner;

public class ReverseStringLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string==");
        String k=sc.nextLine();
        reverseStr(k);
    }
    public static void reverseStr(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("reverse of the string "+s+" is == "+rev);
    }
    
}
