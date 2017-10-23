package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Appliance {
    // you may add your own code here
    private double batteryCapacity;
    private String operationSystem;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;


    public Laptop(double batteryCapacity, String operationSystem, int memoryRom, int systemMemory, double cpu, int displayInches) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", operationSystem='" + operationSystem + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}