import java.util.Scanner;

public class InsertAtEndArr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=s.nextInt();
        System.out.println("enter "+n+" elements.");
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        } 
        System.out.println("enter the element you want to insert.");
        int ele=s.nextInt();
        arr[n]=ele;
        System.out.println("Array after  iserting");
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
            } 
    }
}
