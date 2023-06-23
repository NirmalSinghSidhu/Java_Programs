import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first NUmber");
        int n1=sc.nextInt();
        System.out.println("Enter tye second number..");
        int n2=sc.nextInt();
        gcd.calculateGcd(n1, n2);
    }
    public static void calculateGcd(int a,int b ) {
       int gcd=1;
       for(int i=1;i<=a&&i<=b;i++){
        if(a%i==0&&b%i==0){
            gcd=i;
        }
       }
       System.out.println("GCD or Greatest Common Devisor of "+a+" and "+b+" is.."+ gcd);
    }
    
}
