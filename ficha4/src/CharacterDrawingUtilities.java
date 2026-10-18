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
        drawNewLine();
        System.out.println("Retângulo");
        for(int i=0; i<largura; i++){
            drawHorizontalSegmentWith(caracter, comprimento);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith (char caracter, int comprimento, int largura){
        drawNewLine();
        System.out.println("Retângulo vazio");
        for(int i=1; i<=largura; i++){
            if(i==1 ||  i==largura){
                drawHorizontalSegmentWith(caracter, comprimento);
                drawNewLine();
            } else {
                for(int j=1; j<=comprimento; j++){
                    if(j==1 || j==comprimento){
                        drawElement(caracter);
                    } else {
                        System.out.print(" ");
                    }
                }
                drawNewLine();
            }
        }
    }
}
