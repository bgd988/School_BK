package computer;

public class Computer {
    
    
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer() {
    
    }
    
    public Computer(double processTact, double memory,int hardDrive ) {
       
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;

    }

    
    public double getProcessTact() {
        return this.processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }
    
    public double getMemory() {
        return this.memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    
      public int getHardDrive() {
        return this.hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
     public void info() {
        System.out.println("Process tact:" + getProcessTact());
        System.out.println("Memory:" + getMemory());
        System.out.println("Hard driver:" + getHardDrive());
//proba
    }
    
    
}
