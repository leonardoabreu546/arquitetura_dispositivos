public class ArrayUtilities {
    public static String toString(int[] array){
        StringBuilder res =new StringBuilder();

        for(int i=0;i<array.length; i++){
            res.append(array[i]);

            if (i< array.length -1){
                res.append(", ");
            }
        }

        return res.toString();
    }
}
