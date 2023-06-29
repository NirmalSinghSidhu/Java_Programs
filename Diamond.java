import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter the N");
        int n=sc.nextInt();
        System.out.println("jkfjkgj");
        int i,j,k;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
             System.out.print(" ");
            }
            for(k=1;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=n-1;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
