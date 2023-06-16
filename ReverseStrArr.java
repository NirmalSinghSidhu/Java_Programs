import java.util.Scanner;

public class ReverseStrArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=str.length();i>0;i--){
            System.out.print(ch[i-1]);
        }
    }
    
}
