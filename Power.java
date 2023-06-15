import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        long n,p,res=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ==>");
        n=sc.nextLong();
        System.out.println("enter the power ==>");
        p=sc.nextLong();
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
        System.out.println(n+"^"+p+"===> "+res);
    }
    
}
