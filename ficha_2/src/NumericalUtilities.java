public class NumericalUtilities {

    public static int powerOf(int base, int expoente) {
        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int sumOfNaturalNumbersUpTo(int numero) {
        int resultado=0;
        for (int i=0; i<=numero; i++){
            resultado+=i;
        }
        return resultado;
    }

    public static int sumOfNaturalNumbersBetween(int numero1, int numero2) {
        int resultado = 0;
        for (int i = numero1+1; i < numero2; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int sumOfEvenNumbersBetween(int numero1, int numero2) {
        int resultado = 0;
        for (int i = numero1+1; i < numero2; i++) {
            if(i%2==0)
                resultado += i;
        }
        return resultado;
    }

    public static int[] numberOfDivisorsOf(int numero) {
        int quantidade=0;
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0) {
                quantidade += 1;
            }
        }

        int[] divisores = new int[quantidade];

        int indice=0;
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0) {
                divisores[indice] = i;
                indice++;
            }
        }
        return divisores;
    }

    public static boolean isPrime(int numero) {
        int quantidade=0;
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0) {
                quantidade += 1;
            }
        }
        return quantidade == 2;
    }

}