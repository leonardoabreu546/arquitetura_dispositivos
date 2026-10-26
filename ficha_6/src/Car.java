public class Car extends Vehicle {
    public Car(){
        super(); // Chama o construtor vazio de Vehicle
    }

    public Car(int year, String brand, String model, double price, String color){
        super(year, brand, model, price, color); // Chama o construtor com parâmetros de Vehicle
    }

    @Override
    public String toString(){
        return "Car{" + super.toString() + "}";
    }

}
