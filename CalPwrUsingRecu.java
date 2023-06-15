import java.util.Scanner;

public class CalPwrUsingRecu {
    static long r=1;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        long num=s.nextLong();
        System.out.println("enter the power");
        long pow=s.nextLong();
        CalPwrUsingRecu.power(num,pow);
        System.out.println(num+"^"+pow+"===> "+r);

    }
    public static void power(long n,long p){
        if(n>=0&&p==0){
            return ;
        }
        else if(n==0&&p>=1){
            r=0;
            return ;
        }
        else{
            r=r*n;
            CalPwrUsingRecu.power(n, p-1);
        }
       
    }
}
