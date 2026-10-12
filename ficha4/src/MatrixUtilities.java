public class MatrixUtilities {
    public static void show (int[][] matrix1) {
        for (int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
