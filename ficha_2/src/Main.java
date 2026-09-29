import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int resultado = NumericalUtilities.powerOf(2, 3);
        System.out.println("O resultado da potência é: " + resultado);

        int soma = NumericalUtilities.sumOfNaturalNumbersUpTo(5);
        System.out.println("O resultado da soma é: " + soma);

        int somaIntervalo = NumericalUtilities.sumOfNaturalNumbersBetween(1, 5);
        System.out.println("A soma do intervalo é: " + somaIntervalo);

        int somaParesIntervalo = NumericalUtilities.sumOfEvenNumbersBetween(1, 5);
        System.out.println("A soma dos números pares do intervalo é: " + somaParesIntervalo);

        int[] divisores= NumericalUtilities.numberOfDivisorsOf(9);
        System.out.println("Os divisores de " +divisores.length+ " são: " + Arrays.toString(divisores));
        
    }
}