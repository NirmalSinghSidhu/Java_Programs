import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in);
     System.out.println("enter the size of the array");
     int n=s.nextInt();
     System.out.println("enter "+n+" elements.");
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
     } 
     int[] rev= new int[n];
     int j=n-1;
     for(int i=0;i<n;i++,j--){
        rev[i]=arr[j];
     }
     System.out.println("entered matrix is");
     printMAtrix(arr);
     System.out.println(" reverse matrix is ");
     printMAtrix(rev);
    }
    public static void printMAtrix(int A[])
    {
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
            System.out.println(" ");
        }
    }
}
