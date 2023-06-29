public class MirrorStar {
    public static void main(String[] args) {
        int n=6;
    int i,j,k;
    for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
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
