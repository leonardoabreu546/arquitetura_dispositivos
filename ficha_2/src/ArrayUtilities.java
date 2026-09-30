public class ArrayUtilities {
    public static String toString(float[] array){
        StringBuilder res =new StringBuilder();

        for(int i=0;i<array.length; i++){
            res.append(array[i]);

            if (i< array.length -1){
                res.append(", ");
            }
        }

        return res.toString();
    }

    public static float maximumOf (float[] array){
        float maior = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>maior){
                maior=array[i];
            }
        }
        return maior;
    }

    public static float minimumOf (float[] array){
        float menor = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]<menor){
                menor=array[i];
            }
        }
        return menor;
    }

    public static float[] copyOf (float[] array){
        float[] copia = new float[array.length];
        for(int i=0; i<array.length; i++){
            copia[i]=array[i];
        }
        return copia;
    }
}
