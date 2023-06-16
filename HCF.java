import java.util.Scanner;

public class HCF {
    public static int calHcf(int a,int b){
        while(b>0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int x=s.nextInt();
        System.out.println("enter the second one");
        int y=s.nextInt();
        System.out.println("Hcf==="+calHcf(x, y));

    }
    
}
