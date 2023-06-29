import java.util.Scanner;

public class InsertAtPosArr {   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=s.nextInt();
        System.out.println("enter "+n+" elements.");
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        }
        System.out.println("enter the postion at which you want to insert element");
        int p=s.nextInt();
        System.out.println("enter the element");
        int ele=s.nextInt();
        for(int i=n-1;i>=p-1;i--){
           arr[i+1]=arr[i];
        } 
        arr[p-1]=ele;
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
