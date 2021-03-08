package bean;

import java.io.Serializable;

public class Laptop extends ComputerAppliance implements Serializable {

    private static final long serialVersionUID = 18L;

    private String OS;
    private int systemMemory;
    private double cpu;

    public Laptop() {
        super();

    }

    public Laptop(String OS, int systemMemory, double cpu) {
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public Laptop(int batteryCapacity, int displayInches, int memoryROM, String OS, int systemMemory, double cpu) {
        super(batteryCapacity, displayInches, memoryROM);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((OS == null) ? 0 : OS.hashCode());
        result = prime * result + systemMemory;
        result = prime * result + (int) cpu;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (OS == null) {
            if (other.OS != null)
                return false;
        } else if (!OS.equals(other.OS))
            return false;
        if (systemMemory != other.systemMemory)
            return false;
        if (cpu != other.cpu)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Laptop [OS =" + OS + ", systemMemory =" + systemMemory + ", cpu =" + cpu + "batteryCapacity =" + getBatteryCapacity() + ", displayInches ="
                + getDisplayInches() + ", memoryROM =" + getMemoryROM() + "]";
    }
}
