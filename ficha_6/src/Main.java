public class Main {
    public static void main(String[] args){
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
    }
}
