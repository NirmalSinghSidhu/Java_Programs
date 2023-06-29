public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={14556,8,68,4,0,66,5,57,89};
        System.out.println("before sorting");
        SelectionSort.printArr(arr);
       sortSelc(arr);;
        System.out.println("After sorting");
        SelectionSort.printArr(arr);
    }
    public static void sortSelc(int A[]){
        int i,j;
        int n=A.length;
        for(i=1;i<n;i++){
            int key=A[i];
            j=i-1;
            while(j>=0 && A[j]>key){
            A[j+1]=A[j];
            j=j-1;
        }
        A[j+1]=key;
    }
  }
}
