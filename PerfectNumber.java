import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        long n=sc.nextLong();
        PerfectNumber.checkPerfect(n);
    }
    public static void checkPerfect(long a){
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            System.out.println("number is Perfect...");
        }
        else{
        System.out.println("number is not perfect..");
        }
    }
}
