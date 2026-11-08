public class Desktop extends Computador {
    private int screens;
    private boolean isWaterCooled;

    public Desktop() {
        super();
        screens = 0;
        isWaterCooled = false;
    }

    public Desktop(String brand, String model, double cpuSpeed, int ram, GPU gpu, int screens, boolean isWaterCooled) {
        super(brand, model, cpuSpeed, ram, gpu); // Envia os dados comuns para a mãe
        this.screens = screens;                  // Inicializa o de andamento local
        this.isWaterCooled = isWaterCooled;      // Inicializa o local
    }

    public int getScreens() {
        return screens;
    }

    public void setScreens(int screens) {
        this.screens = screens;
    }

    public boolean isWaterCooled() {
        return isWaterCooled;
    }

    public void setWaterCooled(boolean waterCooled) {
        isWaterCooled = waterCooled;
    }

    @Override
    public void turnOn() {
        System.out.println("A ligar o desktop..."); // Faltava o ponto e vírgula aqui
    }
}