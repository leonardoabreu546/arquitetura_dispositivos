public class CharacterDrawingUtilities {
    public static void drawElement (char caracter){
        System.out.print(caracter);
    }

    public static void drawNewLine (){
        System.out.println();
    }

    public static void drawHorizontalSegmentWith (char caracter, int comprimento) {
        for(int i=0; i<comprimento; i++){
            drawElement(caracter);
        }
    }

    public static void drawFilledRectangleWith (char caracter, int comprimento, int largura){
        drawNewLine();
        System.out.println("Retângulo");
        for(int i=0; i<largura; i++){
            drawHorizontalSegmentWith(caracter, comprimento);
            drawNewLine();
        }

    }
}
