public class AddMatrices {
    public static void main(String[] args) {
        int[][] A={{1,1,1},{2,2,2},{3,3,3}};
        int[][] B={{1,1,1},{2,2,2},{3,3,3}};
        int[][] C= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
         //printing the matrices to be Added..
         System.out.println("First matrix is..");
         Matrix.printMatrix(A,3,3);
         System.out.println("Second Matrix is..");
         Matrix.printMatrix(B,3,3);
         System.out.println("Resultant matrice is");
         Matrix.printMatrix(C, 3, 3);
    
    }
    
}
