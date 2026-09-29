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

}