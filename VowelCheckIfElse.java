import java.util.Scanner;

public class VowelCheckIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char s=sc.next().charAt(0);
        if(s=='a'||s=='e'||s=='o'||s=='i'||s=='u'||s=='A'||s=='E'||s=='O'||s=='I'||s=='U'){
            System.out.println("Enter charcter "+ s+" is a Vowel");
        }
        else{
            if(s>='a'&&s<='z'||s>='A'&&s<='Z'){
                System.out.println("The given character "+s+" is a consonent..");
            }
            else{
            System.out.println("Not a character !!");
            }
        }
    }
    
}
