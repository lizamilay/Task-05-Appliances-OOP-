package bean;

import java.io.Serializable;

public class TabletPC extends  ComputerAppliance implements Serializable {
    private static final long serialVersionUID = 18L;

    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
        super();
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
        super(batteryCapacity, displayInches, memoryROM);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryROM) {
        super(batteryCapacity, displayInches, memoryROM);
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + flashMemoryCapacity;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
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
        TabletPC other = (TabletPC) obj;
        if (flashMemoryCapacity != other.flashMemoryCapacity)
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TabletPC [flashMemoryCapacity =" + flashMemoryCapacity + ", color =" + color + "batteryCapacity =" + getBatteryCapacity() + ", displayInches ="
                + getDisplayInches() + ", memoryROM =" + getMemoryROM() +  "]";
    }
}
