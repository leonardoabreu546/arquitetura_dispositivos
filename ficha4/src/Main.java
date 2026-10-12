import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //exercício 2
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MatrixUtilities.show(matrix);

        //exercicio3
        int[][] matrizIrregular = {
                {1, 2, 3},
                {4, 5}
        };
        boolean isMatrix = MatrixUtilities.isMatrix(matrizIrregular);

        if (isMatrix) {
            System.out.println("É uma matriz"); // Se for verdadeiro
        } else {
            System.out.println("Não é uma matriz"); // Se for falso
        }

    };
}


