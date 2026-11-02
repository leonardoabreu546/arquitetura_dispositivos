public class Triangle extends Shape {
    private double base;
    private double altura;

    public Triangle(){
        super();
        this.altura=0;
        this.base=0;
    }

    public Triangle(Point position, double base, double altura){
        super(position);
        this.base=base;
        this.altura=altura;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base=base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura=altura;
    }

    @Override
    public double getArea(){
        return (base*altura)/2;
    }

    @Override
    public double getPerimeter(){
        double hipotenusa=Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
        return base+altura+hipotenusa;
    }

    @Override
    public String toString(){
        return "Triângulo [Posição: (" + getPosition().getX() + ", " + getPosition().getY() + "), Base: " + base + ", Altura: " + altura + ", Área: " + getArea() + ", Perímetro: " + getPerimeter() + "]";
    }
}
