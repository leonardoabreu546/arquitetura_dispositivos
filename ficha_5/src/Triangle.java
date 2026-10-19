public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (){
        this.a = new Point(0,0);
        this.b = new Point(1,0);
        this.c = new Point(0,1);
    }

    public Triangle (Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA(){
        return a;
    }

    public void setA(Point a){
        this.a = a;
    }

    public Point getB(){
        return b;
    }

    public void setB(Point b){
        this.b = b;
    }

    public Point getC(){
        return c;
    }

    public void setC(Point c){
        this.c = c;
    }

    public void setTriangle(Point a, Point b, Point c){
        setA(a);
        setB(b);
        setC(c);
    }

    public double calcularBase(){
        return a.calcularDistancia(b);
    }

    public double calcularAltura(){
        return Math.abs(c.getY()- a.getY());
    }

    public double calcularArea(){
        double base = calcularBase();
        double altura = calcularAltura();

        return (base*altura)/2.0;
    }
}