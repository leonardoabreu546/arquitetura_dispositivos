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

        float[] numeros3 = {10.8f, 20, 30.6f};
        String texto = ArrayUtilities.toString(numeros3);
        System.out.println(texto);

        float[] numeros4 = {12.4f, 6.7f, 7.8f, 5.0f};
        float maior = ArrayUtilities.maximumOf(numeros4);
        System.out.println("O maior número é: " + maior);


        float menor = ArrayUtilities.minimumOf(numeros4);
        System.out.println("O menor número é: " + menor);

        float[] copia = ArrayUtilities.copyOf(numeros4);
        System.out.println("Cópia do array: " + ArrayUtilities.toString(copia));

        float numeroVerificar=12.4f;
        boolean existe = ArrayUtilities.contains(numeros4, numeroVerificar);
        if (existe){
            System.out.println("O número " + numeroVerificar + " pertence ao array.");
        } else {
            System.out.println("O número " + numeroVerificar + " não pertence ao array.");
        }

        float[] numeros5 = {12.8f, 34.9f, 21.6f, 12.8f};
        boolean repetido = ArrayUtilities.containsDuplicates(numeros5);
        if (repetido){
            System.out.println("O array tem números duplicados.");
        } else {
            System.out.println("O array não tem números duplicados.");
        }

        int existente = ArrayUtilities.indexOf(numeros4, numeroVerificar);
        if (existente==-1){
            System.out.println("O número não existe no array: " + existente);
        } else {
            System.out.println("O número existe no array: " + existente);
        }

        float adicionar = 65.7f;
        float[] novoArray=ArrayUtilities.add(numeros5, adicionar);
        System.out.println("O novo array é: " +ArrayUtilities.toString(novoArray));
    }
}