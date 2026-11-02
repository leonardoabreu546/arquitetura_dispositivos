public abstract class Shape implements Labelled, Measurable{
    private Point position;

    public Shape() {
        this.position = new Point();
    }

    public Shape(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString(){
        return ("Posição: " + getPosition());
    }

    @Override
    public String getLabel(){
        return(getClass().getSimpleName() + ", posição: " + getPosition());
    }

}


