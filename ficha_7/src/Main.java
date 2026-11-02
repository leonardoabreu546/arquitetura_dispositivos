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

    
    
}

