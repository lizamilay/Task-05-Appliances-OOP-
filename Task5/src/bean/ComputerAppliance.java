package bean;

import java.io.Serializable;

public class ComputerAppliance extends Appliance implements Serializable {
    private static final long serialVersionUID = 18L;

    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;

    public ComputerAppliance() {
    }

    public ComputerAppliance(int batteryCapacity, int displayInches, int memoryROM) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + batteryCapacity;
        result = prime * result + displayInches;
        result = prime * result + memoryROM;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        ComputerAppliance other = (ComputerAppliance) obj;
        if (batteryCapacity != other.batteryCapacity)
            return false;
        if (displayInches != other.displayInches)
            return false;
        if (memoryROM != other.memoryROM)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ComputerAppliance [batteryCapacity =" + batteryCapacity + ", displayInches ="
                + displayInches + ", memoryROM =" + memoryROM + "]";
    }
}
