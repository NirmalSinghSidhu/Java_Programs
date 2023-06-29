public class HeapSort {
    public static void main(String[] args) {
        int[] arr= {145,56,156,65,56568,6,4,2};
        System.out.println("before sorting");
        SelectionSort.printArr(arr);
        sortHeap(arr);
        System.out.println("After sorting");
        SelectionSort.printArr(arr);
    }
    public static void sortHeap(int[] A){
        //Creating a maxHeap
        int n=A.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(A,n, i);
        }
        //sorting
        for(int i=n-1;i>=0;i--){
            int last=A[i];
            A[i]=A[0];
            A[0]=last;
            //heapify for reduced
            heapify(A, n, 0);
        }

    }
    public static void heapify(int[] A,int n,int i){
         int largest =i;
         int left=2*i+1;
         int right=2*i+2;
         if(left>n && A[left]>A[largest]){
            largest=left;
         }
         if(right>n && A[right]>A[largest]){
            largest=right;
         }
         if(largest!=i){
            int swap=A[i];
            A[i]=A[largest];
            A[largest]=swap;
            
            //recursively calling the function again
            heapify(A, n, largest);
         }


    }
    
}
