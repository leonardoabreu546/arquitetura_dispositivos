public class Main {
    public static void main(String[] args){

        Car meuCarro = new Car(2024, "Tesla", "Model 3", 45000.0, "Preto");

        System.out.println("--- Teste com Parâmetros ---");
        System.out.println(meuCarro);

        System.out.println();

        Car outroCarro = new Car();
        outroCarro.setYear(2021);
        outroCarro.setBrand("Volkswagen");
        outroCarro.setModel("Golf");
        outroCarro.setPrice(18500.00);
        outroCarro.setColor("Azul");

        System.out.println("--- Teste com Construtor Vazio + Setters ---");
        System.out.println(outroCarro);

    }
}
