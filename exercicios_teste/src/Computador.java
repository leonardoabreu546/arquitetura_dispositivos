public abstract class Computador{
    protected String brand;
    protected String model;
    protected double cpuSpeed;
    protected int ram;
    protected GPU gpu;

    public Computador(){
        brand="";
        model="";
        cpuSpeed=0.0;
        ram=0;
        gpu=null;
    }

    public Computador(String brand, String model, double cpuSpeed, int ram, GPU gpu){
        this.brand=brand;
        this.model=model;
        this.cpuSpeed=cpuSpeed;
        this.ram=ram;
        this.gpu=gpu;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public double getCpuSpeed(){
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed){
        this.cpuSpeed=cpuSpeed;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram=ram;
    }

    public GPU getGpu(){
        return gpu;
    }

    public void setGpu(GPU gpu){
        this.gpu=gpu;
    }

    public abstract void turnOn();
}