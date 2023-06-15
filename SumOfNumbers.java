import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int s1=0;
        Scanner s=new Scanner(System.in);
        System.out.println("How many number you want to add?");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+" numbers...");
        for(int i=0;i<n;i++){
            System.out.println("enter the "+(i+1)+" number");
            arr[i]=s.nextInt();
        }
        int sum= SumOfNumbers.sum(arr, n-1, s1);
        System.out.println("sum of "+sum);
    }
    public static int sum(int[] a,int n,int s1){
        if(n<0){
            return s1;
        }
        else{
            s1=s1+a[n];
            return SumOfNumbers.sum(a, n-1, s1);
        }
    }

     
}
