public class MergeSort {
    public static void divide(int arr[],int l,int r){
        if(l<r){
        int mid=(l+r)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        conquer(arr, mid, l, r);
        }
    }
    public static void conquer(int arr[],int m,int l,int r){
        int[] merged=new int[r+1];
        int i,j,c=l;
        for(i=l,j=m+1;i<=m&&j<=r;c++){
            if(arr[i]<=arr[j]){
                merged[c]=arr[i++]; 
            }
            else{
                merged[c]=arr[j++];
            }
            while(i<=m){
                merged[c]=arr[i++]; 
            }
            while(j<=r){
                merged[c]=arr[j++];
            }
            for(i=l;i<=r;i++){
                arr[i]=merged[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] A={164,4,99,7,1,5,0,74};
        divide(A, 0, A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
