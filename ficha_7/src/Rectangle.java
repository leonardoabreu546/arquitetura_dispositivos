public class Rectangle extends Shape {
    private double comp;
    private double larg;

    public Rectangle() {
        super();
        this.larg = 0.0;
        this.comp = 0.0;
    }

    public Rectangle(Point position, double comp, double larg) {
        super(position);
        this.larg = larg;
        this.comp = comp;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    @Override
    public double getArea() {
        return comp * larg;
    }

    @Override
    public double getPerimeter() {
        return 2 * (comp + larg);
    }

    @Override
    public String toString() {
        return "Retângulo [Posição: (" + getPosition().getX() + ", " + getPosition().getY() + "), Comprimento: " + comp + ", Largura: " + larg + ", Área: " + getArea() + ", Perímetro: " + getPerimeter() + "]";
    }
}
