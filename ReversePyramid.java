public class ReversePyramid {
    public static void main(String[] args) {
        int i,j,k,n=8;
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
