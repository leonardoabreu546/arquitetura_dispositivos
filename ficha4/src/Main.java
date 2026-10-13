import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //exercício 2
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MatrixUtilities.show(matriz1);

        //exercicio 3
        int[][] matrizIrregular = {
                {1, 2, 3},
                {4, 5}
        };
        boolean isMatriz = MatrixUtilities.isMatrix(matrizIrregular);

        if (isMatriz) {
            System.out.println("É uma matriz"); // Se for verdadeiro
        } else {
            System.out.println("Não é uma matriz"); // Se for falso
        }

        int[][] matrizIdentidade = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        //exercício 4
        boolean resultado = MatrixUtilities.isIdentity(matrizIdentidade);

        if (resultado) {
            System.out.println("É uma matriz identidade");
        } else {
            System.out.println("Não é uma matriz identidade");
        }

        //exercício 5
        int[][] matriz2 = MatrixUtilities.multiplyBy(matriz1, 4);
        System.out.println("Nova matriz: ");
        MatrixUtilities.show(matriz2);

        int[][] matriz3 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        MatrixUtilities.areCompatibleForSum(matriz1, matriz3);

    };
}


