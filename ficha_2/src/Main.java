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

        int numero1 = 9;
        int[] divisores1 = NumericalUtilities.numberOfDivisorsOf(numero1);
        System.out.println("Os divisores de " +numero1+ " são: " + Arrays.toString(divisores1));

        int numero2 = 3;
        boolean divisores2 = NumericalUtilities.isPrime(numero2);
        if (divisores2) {
            System.out.println("O número " + numero2 + " é primo.");
        } else {
            System.out.println("O número " + numero2 + " não é primo.");
        }

        int[] numeros = {10, 20, 30};
        String texto = ArrayUtilities.toString(numeros);
        System.out.println(texto);


    }
}