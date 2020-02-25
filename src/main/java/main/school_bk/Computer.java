/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.school_bk;

/**
 *
 * @author mojme
 */
public class Computer {
    
    private String operatingSystem = "Linux";
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public Computer() {
        this.operatingSystem = "";
        this.processTact = 0.0;
        this.memory = 0.0;
        this.hardDrive = 0;

    }
    
    public Computer(String customoperatingSystem, double customProcessTact, double customMemory,int customHardDrive ) {
        this.operatingSystem = customoperatingSystem;
        this.processTact = customProcessTact;
        this.memory = customMemory;
        this.hardDrive = customHardDrive;

    }
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String customoperatingSystem) {
        this.operatingSystem = customoperatingSystem;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }

    public void setProcessTact(double customProcessTact) {
        this.processTact = customProcessTact;
    }
    
    public double getMemory() {
        return this.memory;
    }

    public void setNumberOfClasses(double customMemory) {
        this.memory = customMemory;
    }
    
      public int getHardDrive() {
        return this.hardDrive;
    }

    public void setNumberOfClasses(int customHardDrive) {
        this.hardDrive = customHardDrive;
    }
    
    
}
