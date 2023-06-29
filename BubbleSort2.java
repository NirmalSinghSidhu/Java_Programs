import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort2 {
    public static void main(String[] args) throws IOException {
        int n,i;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter N");
        n=Integer.parseInt(b.readLine());
        int a[]=new int[n];
        System.out.println("enter "+n+" elements");
        for(i=0;i<n;i++){
            a[i]=Integer.parseInt(b.readLine());
        }
        System.out.println("elements in array");
        SelectionSort.printArr(a);
        System.out.println("after sorting");
        bubbleSort.sortBub(a);
        SelectionSort.printArr(a);
         
    }
}
