public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y){
    this.x = x;
    this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setPoint(double x, double y){
        setX(x);
        setY(y);
    }

    public double calcularDistancia(Point outroPonto){
        double difX = outroPonto.getX()-this.x;
        double difY = outroPonto.getY()-this.y;

        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }


}

