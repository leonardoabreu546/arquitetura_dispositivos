public class Circle extends Shape {
    private double radius;

    public Circle() {
        super(); // Chama o construtor vazio da Shape
        this.radius = 1.0; // Valor por defeito
    }

    public Circle(Point position, double radius) {
        super(position); // Manda o "envelope" com a posição para a mãe (Shape)
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // AQUI É QUE O MÉTODO DEIXA DE ESTAR VAZIO!
    // A classe Circle pega no método abstrato e dá-lhe a lógica real:
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Círculo [Posição: (" + getPosition().getX() + ", " + getPosition().getY() + "), Raio: " + radius + ", Área: " + getArea() + ", Perímetro: " + getPerimeter() + "]";
    }
}