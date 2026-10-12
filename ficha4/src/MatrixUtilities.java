public class MatrixUtilities {
    public static void show (int[][] matrix1) {
        for (int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1[i].length; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isMatrix (int[][] matrixIrregular){
        int tamanhoLinha = matrixIrregular[0].length;
        for (int i=0; i<matrixIrregular.length; i++){
            if(matrixIrregular[i].length!=tamanhoLinha){
                return false;
            }
        }
        return true;
    };
}
