import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the row size of first matrix");
        int r1=s.nextInt();
        System.out.println("enter the column size of first matrix");
        int c1=s.nextInt();
        System.out.println("enter the row size of second matrix");
        int r2=s.nextInt();
        System.out.println("enter the colunm size of second matrix");
        int c2=s.nextInt();
        int[][] A=new int[r1][c1];
        int[][] B= new int[r2][c2];
        System.out.println("enter the elemnets of first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elemnets of second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=s.nextInt();
            }
        }
        //here i have used the method of another class
        //printing the matrices to be multiplied..
        System.out.println("First matrix is..");
        Matrix.printMatrix(A, r1, c1);
        System.out.println("Second Matrix is..");
        Matrix.printMatrix(B, r2, c2);
        if(r1!=c2){
            System.out.println("Multiplication not possible..");
            return;
        }
        int c[][]=new int[r2][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++){
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        //Print the multiplied matrix
        System.out.println("The resulatant matrix is ..");
        Matrix.printMatrix(c, r2, c1);

    }
    
}
