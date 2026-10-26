public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;

    public Rectangle(){
        this.topLeftPoint = new Point(0, 0);
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(Point topLeftPoint, double height, double width){
        this.topLeftPoint = topLeftPoint;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(Point topLeftPoint){
        this.topLeftPoint = topLeftPoint;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calcularArea(){
        double width = getWidth();
        double height = getHeight();

        return width * height;
    }

    public double calcularPerimetro() {
        double largura = getWidth();
        double altura = getHeight();

        return 2 * (largura+altura);
    }
}
