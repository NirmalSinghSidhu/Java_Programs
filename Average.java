import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int n,res=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of element to be entered");
            n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the "+n+"elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                res=res+arr[i];
            }
        }
        int avg=res/n;
        System.out.println( "Average og the numbers entered by you is=="+avg);
    }
    
}
