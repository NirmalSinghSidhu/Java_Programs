public class MIrrorLowerStar {
    public static void main(String[] args) {
        int i,j,k,n=6;
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
