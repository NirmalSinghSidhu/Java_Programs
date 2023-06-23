import java.util.Scanner;

public class MatrixSub {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the row size of matrix");
        int r1=s.nextInt();
        System.out.println("enter the column size of  matrix");
        int c1=s.nextInt();
    
        int[][] A=new int[r1][c1];
        int[][] B= new int[r1][c1];
        System.out.println("enter the elemnets of first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elemnets of second matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                B[i][j]=s.nextInt();
            }
        }
        //here i have used the method of another class
        //printing the matrices to be multiplied..
        System.out.println("First matrix is..");
        Matrix.printMatrix(A, r1, c1);
        System.out.println("Second Matrix is..");
        Matrix.printMatrix(B, r1,c1);
        int[][] C=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                C[i][j]=A[i][j]-B[i][j];
            }
        }
        System.out.println("Matrix after subtraction is..");
        Matrix.printMatrix(C, r1, c1);
        
    }
    
}
