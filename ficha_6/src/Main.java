public class Main {
    public static void main(String[] args) {
        // --- Testes Carro ---
        // Testar o construtor com parâmetros
        Car meuCarro = new Car(2024, "Tesla", "Model 3", 45000.0, "Preto");

        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(meuCarro);

        System.out.println();

        // Testar o construtor com os Setters
        Car outroCarro = new Car();
        outroCarro.setYear(2021);
        outroCarro.setBrand("Volkswagen");
        outroCarro.setModel("Golf");
        outroCarro.setPrice(18500.00);
        outroCarro.setColor("Azul");

        System.out.println("--- Teste com Construtor Vazio + Setters ---");
        System.out.println(outroCarro);

        System.out.println();

        // --- Testes Mota ---
        //Testar o construtor com parâmetros
        Motorcycle minhaMota = new Motorcycle(2023, "Yamaha", "MT-07", 7500.0, "Vermelho");

        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(minhaMota);

        System.out.println();

        // Testar o construtor com os Setters
        Motorcycle outraMota = new Motorcycle();
        outraMota.setYear(2022);
        outraMota.setBrand("Honda");
        outraMota.setModel("CB500F");
        outraMota.setPrice(6200.00);
        outraMota.setColor("Branco");

        System.out.println("--- Teste Mota com Construtor Vazio + Setters ---");
        System.out.println(outraMota);

        System.out.println();

        // --- Testes Círculo ---

        // Testar o construtor com parâmetros
        Point p1 = new Point(2.0, 3.0);
        Circle meuCirculo = new Circle(p1, 5.0);

        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(meuCirculo);

        System.out.println();

        // Testar o construtor com os Setters
        Circle outroCirculo = new Circle();
        outroCirculo.setPosition(new Point(1.0, 1.0)); // herdado da classe Shape
        outroCirculo.setRadius(10.0);

        System.out.println("--- Teste Círculo com Construtor Vazio + Setters ---");
        System.out.println(outroCirculo);

        System.out.println();

        // --- Testes Retângulo ---

        // Testar o construtor com parâmetros
        Point p2 = new Point (4.0, 2.0);
        Rectangle meuRectangulo = new Rectangle(p2, 4.0, 3.0);
        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(meuRectangulo);

        System.out.println();

        // Testar o construtor com os Setters
        Rectangle outroRectangulo = new Rectangle();
        outroRectangulo.setPosition(new Point(3.0, 5.0));
        outroRectangulo.setComp(4.0);
        outroRectangulo.setLarg(2.0);

        System.out.println("--- Teste Retângulo com Construtor Vazio + Setters ---");
        System.out.println(outroRectangulo);

        System.out.println();

        // --- Testes Triângulo ---

        // Testar o construtor com parâmetros
        Point p3= new Point(5.0, 4.0);
        Triangle meuTriangulo = new Triangle(p3, 5.0, 6.0);
        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(meuTriangulo);

        // Testar o construtor com os Setters
        Triangle outroTriangulo= new Triangle();
        outroTriangulo.setPosition(new Point(1.0, 3.0));
        outroTriangulo.setBase(3.0);
        outroTriangulo.setAltura(5.0);

        System.out.println("--- Teste Triângulo com Construtor Vazio + Setters ---");
        System.out.println(outroTriangulo);
        System.out.println();



    }
}
