public class MatrixUtilities {
    public static void show (int[][] matriz1) {
        for (int i=0; i<matriz1.length; i++){
            for(int j=0; j<matriz1[i].length; j++){
                System.out.print(matriz1[i][j] + " ");
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

    public static boolean isIdentity(int[][] matriz2) {
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                // Se estiver na diagonal principal
                if (i == j) {
                    if (matriz2[i][j] != 1) {
                        return false;
                    }
                }
                // Se estiver fora da diagonal principal
                else {
                    if (matriz2[i][j] != 0) {
                        return false;
                    }
                }

            }
        }
        return true;
    };
}
