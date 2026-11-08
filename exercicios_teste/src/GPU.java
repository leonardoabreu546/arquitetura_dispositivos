public class GPU{
    private String cores;
    private int memory;
    private double baseSpeed;

    public GPU(){
        cores="";
        memory=0;
        baseSpeed=0.0;
    }

    public GPU(String cores, int memory,double baseSpeed){
        this.cores=cores;
        this.memory=memory;
        this.baseSpeed=baseSpeed;
    }

    public String getCores(){
        return cores;
    }

    public void setCores(String cores){
        this.cores=cores;
    }

    public int getMemory(){
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(double baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
}