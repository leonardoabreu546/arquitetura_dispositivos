public class Laptop extends Computador {
    private double batteryLife;
    private boolean hasTouchscreen;

    public Laptop() {
        super();
        this.batteryLife = 0.0;
        this.hasTouchscreen = false;
    }

    public Laptop(String brand, String model, double cpuSpeed, int ram, GPU gpu, double batteryLife, boolean hasTouchscreen) {
        super(brand, model, cpuSpeed, ram, gpu);
        this.batteryLife = batteryLife;
        this.hasTouchscreen = hasTouchscreen;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasTouchscreen() {
        return hasTouchscreen;
    }

    public void setHasTouchscreen(boolean hasTouchscreen) {
        this.hasTouchscreen = hasTouchscreen;
    }

    @Override
    public void turnOn() {
        System.out.println("A ligar o laptop a bateria...");
    }
}