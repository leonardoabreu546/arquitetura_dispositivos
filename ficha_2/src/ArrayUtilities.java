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

    public static boolean contains (float[] array, float verificar){
        for (int i=0; i<array.length; i++){
            if(array[i]==verificar) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicates (float[] array){
        for (int i=0; i<array.length; i++){
            for (int v=i+1; v<array.length; v++) {
                if (array[i] == array[v]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOf (float[] array, float verificar){
        for (int i=0; i<array.length; i++){
            if(array[i]==verificar) {
                return i;
            }
        }
        return -1;
    }

    public static float[] add (float[] array, float adicionar){

        float[] novoArray = new float[array.length+1];

        for(int i=0; i< array.length; i++){
            novoArray[i] = array[i];
        }

        novoArray[array.length] = adicionar;

        return novoArray;

    }

    public static float[] remove (float[] array, float eliminar){

        int indiceEncontrado = indexOf(array, eliminar);
        if(indiceEncontrado == -1){
            return array;
        }
        float[] novoArray = new float[array.length-1];
        int indice =0;

        for(int i=0; i< array.length; i++){
            if(array[i]!=eliminar) {
                novoArray[indice]=array[i];
                indice+=1;
            }
        }
        return novoArray;
    }

    public static float[] reverse (float[] array){
        float[] arrayInvertido = new float[array.length];
        int indice = 0;
        for (int i=array.length-1; i>=0; i--){
            arrayInvertido[indice]=array[i];
            indice++;
        }
        return arrayInvertido;
    }

    public static String[] vetor(String[] nAlunos, String[] disciplinas, String[][] matriz){
        String[] Aluno={};
        for(int i=0; i<nAlunos.length; i++){
            Aluno[i]=nAlunos[i];
        }
        return Aluno;

    }

}
