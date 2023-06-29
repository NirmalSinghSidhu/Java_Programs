public class SelectionSort {
    public static void main(String[] args){
        int[] A={23,4,45,789,45,6,12,0,1,3};
        System.out.println("Array before sorting");
        printArr(A);
        sort(A);
        System.out.println("Array after sorting .");
        printArr(A);
        
    }
    public static void sort(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
                    int temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
        }
    }
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
}
