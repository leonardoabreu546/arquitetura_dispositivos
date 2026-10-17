public class CharacterDrawingUtilities {
    public static void drawElement (char caracter){
        System.out.print(caracter);
    }

    public static void drawNewLine (){
        System.out.println();
    }

    public static void drawHorizontalSegmentWith (char caracter, int tamanho) {
        for(int i=0; i<tamanho; i++){
            drawElement(caracter);
        }
        System.out.println();
    }
}
