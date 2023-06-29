import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=s.nextInt();
        System.out.println("enter "+n+" elements.");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        } 
        System.out.println("enter the element you want to search in the array..");
        int k=s.nextInt();
        linearSrch(arr, k);
    }
    public static void linearSrch(int A[],int key){
        for(int i=0;i<A.length;i++){
            if(A[i]==key){
                System.out.println("The element "+key+" is at postion "+(i+1)+" in the array");
                break;
            }
            if(i==A.length-1){
                System.out.println("elemennt "+key+" dosnt exit in the array");
            }
        }
    }
}
