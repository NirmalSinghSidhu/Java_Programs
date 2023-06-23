import java.util.Scanner;

public class LcmOfN {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("How many numbers you want to add.. to check lcm ?");
        int n=s.nextInt();
        long[] arr=new long[n];
        System.out.println("Enter "+n+" numbers..");
        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        LcmOfN.CalLcmOfN(arr);

    }
    //function to calculate the lcm of two numbers
    public static long CalLcm(long a,long b){
        long gcd=1;
        long lcm;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
        }
        lcm=(a*b)/gcd;
        return lcm;
    }
    //Function to calculate to calculate the lcm of n numbers
    public static void CalLcmOfN(long[] A){
        long lcmN=CalLcm(A[0], A[1]);
        for(int i=2;i<A.length;i++){
            lcmN=LcmOfN.CalLcm(lcmN,A[i]);
        }
        System.out.println("lcm is "+lcmN);
    }
    
}
