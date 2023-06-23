import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the row size of matrix");
        int r=s.nextInt();
        System.out.println("enter the column size of  matrix");
        int c=s.nextInt();
        int[][] A=new int[r][c];
        System.out.println("enter the elemnets of matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=s.nextInt();
            }
        }
        int[][] B= new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                B[i][j]=A[j][i];
            }
        }
        //Printing the original matrix
        System.out.println("the original matrix is...");
        Matrix.printMatrix(A, r, c);
        //printing matrix after transpose
        System.out.println("Matrix after taking the transpose.....");
        Matrix.printMatrix(B, c, r);

     }
}