public class bubbleSort {
    public static void main(String[] args) {
        int[] arr= {145,56,156,65,56568,6,4,2};
        System.out.println("before sorting");
        SelectionSort.printArr(arr);
        sortBub(arr);
        System.out.println("After sorting");
        SelectionSort.printArr(arr);
    }
    public static void sortBub(int A[]){
      int i,j,temp;
      int n=A.length;
      for(i=0;i<n-1;i++){
        for(j=0;j<n-1-i;j++){
         if(A[j+1]<A[j]){
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
         }
        }
      }
    }

}
