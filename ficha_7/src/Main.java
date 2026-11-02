import java.util.ArrayList;
public static void main(String[] args) {
    ArrayList<Labelled> elementos = new ArrayList<>();
    elementos.add(new Car(2020, "Toyota", "Corolla", 20000.0, "Azul"));
    elementos.add(new Motorcycle(2022, "Yamaha", "MT-07",7500.0, "Preto"));
    elementos.add(new Circle(new Point(1.0, 2.0), 4.0));
    elementos.add(new Rectangle(new Point(3.0, 4.0), 5.0, 10.0));
    
    for(Labelled elemento : elementos){
        System.out.println(elemento.getLabel());
    }

    ArrayList<Measurable> formas = new ArrayList<>();
    formas.add(new Circle(new Point(1.0, 2.0), 4.0));
    formas.add(new Rectangle(new Point(3.0, 4.0), 5.0, 10.0));
    formas.add(new Triangle(new Point(0.0, 0.0), 3.0, 4.0));

    double somaArea = 0;
    double somaPerimeter = 0;

    for(Measurable forma : formas){

        System.out.println();
        System.out.println(forma.getClass().getSimpleName());
        System.out.print("Área: ");
        System.out.println(forma.getArea());
        System.out.print("Perímetro: ");
        System.out.println(forma.getPerimeter());
        somaArea+=forma.getArea();
        somaPerimeter+=forma.getPerimeter();
    }

    System.out.print("Soma áreas: ");
    System.out.println(somaArea);
    System.out.print("Soma perimetros: ");
    System.out.println(somaPerimeter);

}

