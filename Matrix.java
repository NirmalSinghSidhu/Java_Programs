public class Matrix {
    //Function to print the matrix;
    static void printMatrix(int M[][],int rowSize,int colSize){
        for(int i=0;i<rowSize;i++){
        for(int j=0;j<colSize;j++){
            System.out.print(M[i][j]+" ");
        }
        System.out.println(" ");
    }
    }
    static void MultiplyMatrices(int A[][],int B[][],int rs1,int cs1,int rs2,int cs2){
        int i,j,k;
        //printing the matrices to be multiplied..
        System.out.println("First matrix is..");
        Matrix.printMatrix(A, rs1, cs1);
        System.out.println("Second Matrix is..");
        Matrix.printMatrix(B, rs2, cs2);
        if(rs1!=cs2){
            System.out.println("Multiplication not possible..");
            return;
        }
        int c[][]=new int[rs2][cs1];
        for(i=0;i<rs1;i++){
            for(j=0;j<cs2;j++){
                for(k=0;k<rs2;k++){
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        //Print the multiplied matrix
        System.out.println("The resulatant matrix is ..");
        Matrix.printMatrix(c, rs2, cs1);
    }
    public static void main(String[] args) {
        int[][] a={{1,1,1},{2,2,2},{3,3,3}};
        int[][] b={{1,1,1},{2,2,2},{3,3,3}};
        Matrix.MultiplyMatrices(a,b,3,3,3,3);
    
    }
    
}
