import java.util.Scanner;

class Pow{
    long res=1;
     Pow(long n,long p){
        if(n>=0&&p==0){
            res=1;
        }
        else if(n==0&&p>=1){
            res=0;
        }
        else{
            for(int i=0;i<p;i++){
                res=res*n;
            }
        }
     }
}
public class CalPwrUsingCls {
    public static void main(String[] args) {
        long n,p;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number..");
        n=s.nextLong();
        System.out.println("enter the power..");
        p=s.nextLong();
        Pow p1=new Pow(n, p);
        System.out.println(n+"^"+p+"===> "+p1.res);

    
    }
    
}
